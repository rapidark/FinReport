package com.finreport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.finreport.dao.FinStatementDao;
import com.finreport.model.BalSheet;
import com.finreport.model.BalSheetList;
import com.finreport.model.CFStatement;
import com.finreport.model.CFStatementList;
import com.finreport.model.FinMainIndex;
import com.finreport.model.FinMainIndexList;
import com.finreport.model.IncStatement;
import com.finreport.model.IncStatementList;
import com.finreport.model.Stock;
import com.finreport.model.StockList;

@Component
public class ScheduledTasks {

	Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	private final static String cookiesKey = "xq_a_token";
	
	private final static String symbol = "symbol";
	
	@Autowired
	FinStatementDao finStatementDao;
	
	@Scheduled(fixedRate = 24*60*60*1000)
	public void getFinancialReport() throws InterruptedException {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
//		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 9999));
//		clientHttpRequestFactory.setProxy(proxy);
//		
//		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		RestTemplate restTemplate = new RestTemplate();
		try {
			ClientHttpRequest request = restTemplate.getRequestFactory().createRequest(new URI("http://www.xueqiu.com"), HttpMethod.GET);
			ClientHttpResponse response = request.execute();
			List<String> cookies = response.getHeaders().get("Set-Cookie");
			String token = "";
			for (String item : cookies) {
				 String temp = item.split(";")[0];
				 if(temp.contains(cookiesKey)) {
					 token = temp.replace(cookiesKey + "=" , "");
					 break;
				 }
			}
			
			List<String> insuranceIndustry = new ArrayList<String>();
			
			ResponseEntity<Map> result = restTemplate.getForEntity("http://xueqiu.com/industry/quote_order.json?page=1&size=30&order=desc&exchange=CN&plate=%E4%BF%9D%E9%99%A9%E4%B8%9A&orderBy=percent&level2code=J68&access_token=" + token,  Map.class);
			@SuppressWarnings("unchecked")
			ArrayList<LinkedHashMap<String, String>> list = (ArrayList<LinkedHashMap<String, String>>)result.getBody().get("data");
			for (LinkedHashMap<String, String> item  : list) {
				insuranceIndustry.add(item.get(symbol));
			}
			
			List<String> bankIndustry = new ArrayList<String>();
			
			result = restTemplate.getForEntity("http://xueqiu.com/stock/cata/stocklist.json?page=1&size=30&order=desc&orderby=percent&exchange=CN&plate=%E9%93%B6%E8%A1%8C&access_token=" + token,  Map.class);
			@SuppressWarnings("unchecked")
			ArrayList<LinkedHashMap<String, String>> stocksList= (ArrayList<LinkedHashMap<String, String>>)result.getBody().get("stocks");
			for (LinkedHashMap<String, String> item  : stocksList) {
				bankIndustry.add(item.get(symbol));
			}
			
			int pageSize = 90;
			StockList stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page=1&size=" + pageSize + "&order=desc&orderby=percent&type=11%2C12&access_token=" + token), StockList.class);
			logger.info("---------------------page: " + 1 + " count: " + stockList.getCount());
			for (Stock stock : stockList.getStocks()) {
				if(insuranceIndustry.contains(stock.getSymbol())) {
					// to do add insurance stock
				} else if(bankIndustry.contains(stock.getSymbol())) {
					// to do add insurance stock
				} else {
					getFinancialReportBySymbol(stock, restTemplate, token);
				}
			}
			
			int pageCount = stockList.getCount().getCount()/pageSize + (stockList.getCount().getCount()%pageSize == 0 ? 0 : 1);
			for(int i = 2; i<= pageCount; i++) {
				stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page="+ i +"&size=" + pageSize + "&order=desc&orderby=percent&type=11%2C12&access_token=" + token), StockList.class);
				logger.info("---------------------page: " + i + " count: " + stockList.getCount());
				
				for (Stock stock : stockList.getStocks()) {
					if(insuranceIndustry.contains(stock.getSymbol())) {
						// to do add insurance stock
					} else if(bankIndustry.contains(stock.getSymbol())) {
						// to do add insurance stock
					} else {
						getFinancialReportBySymbol(stock, restTemplate, token);
					}
				}
				
				Thread.currentThread().sleep(100L);
			}
		} catch (IOException | URISyntaxException e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	private void getFinancialReportBySymbol(Stock stock, RestTemplate restTemplate,String token) throws InterruptedException {
		String symbol = stock.getSymbol();
		if(finStatementDao.isStockExist(stock.getCode())) {
			return;
		}
		finStatementDao.addStock(stock);
		logger.info("---------------------insert into stock table stock code:" + stock.getCode() + " success---------");
		IncStatementList incStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/incstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, IncStatementList.class);
		
		List<String> incStatementKey = new ArrayList<String>();
		for (int i = 0; i < incStatementList.getList().size(); i++) {
			IncStatement incStatement = incStatementList.getList().get(i);
			String key= incStatement.getStockcode() + " " + incStatement.getEnddate();
			// void duplicate key.
			if(incStatementKey.contains(key)) {
				incStatementList.getList().remove(i);
				i--;
				continue;
			}
			incStatementKey.add(key);
			incStatement.setStockcode(stock.getCode());
		}
		
		
		
		BalSheetList balSheetList = restTemplate.getForObject("http://xueqiu.com/stock/f10/balsheet.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, BalSheetList.class);
		
		List<String> balSheetKey = new ArrayList<String>();
		for (int i = 0; i < balSheetList.getList().size(); i++) {
			BalSheet balSheet = balSheetList.getList().get(i);
			String key= balSheet.getStockcode() + " " + balSheet.getReportdate();
			// void duplicate key.
			if(balSheetKey.contains(key)) {
				balSheetList.getList().remove(i);
				i--;
				continue;
			}
			balSheetKey.add(key);
			balSheet.setStockcode(stock.getCode());
		}
		
//		finStatementDao.batchAddBalStatement(balSheetList.getList());
		
		CFStatementList cfStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/cfstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, CFStatementList.class);
//		for (CFStatement cFStatement : cfStatementList.getList()) {
//			cFStatement.setStockcode(stock.getCode());
//		}
		List<String> cfStatementKey = new ArrayList<String>();
		for (int i = 0; i < cfStatementList.getList().size(); i++) {
			CFStatement cfStatement = cfStatementList.getList().get(i);
			String key= cfStatement.getStockcode() + " " + cfStatement.getEnddate();
			// void duplicate key.
			if(cfStatementKey.contains(key)) {
				cfStatementList.getList().remove(i);
				i--;
				continue;
			}
			cfStatementKey.add(key);
			cfStatement.setStockcode(stock.getCode());
		}
//		finStatementDao.batchAddCFStatement(cfStatementList.getList());
		
		
		FinMainIndexList finMainIndexList = restTemplate.getForObject("http://xueqiu.com/stock/f10/finmainindex.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, FinMainIndexList.class);
//		for (FinMainIndex finMainIndex : finMainIndexList.getList()) {
//			finMainIndex.setStockcode(stock.getCode());
//		}
		List<String> finMainIndexKey = new ArrayList<String>();
		for (int i = 0; i < finMainIndexList.getList().size(); i++) {
			FinMainIndex finMainIndex = finMainIndexList.getList().get(i);
			String key= finMainIndex.getStockcode() + " " + finMainIndex.getReportdate();
			// void duplicate key.
			if(finMainIndexKey.contains(key)) {
				finMainIndexList.getList().remove(i);
				i--;
				continue;
			}
			finMainIndexKey.add(key);
			finMainIndexList.getList().get(i).setStockcode(stock.getCode());
		}
//		finStatementDao.batchAddFinMainIndex(finMainIndexList.getList());
		
		finStatementDao.batchAddFinancialReport(balSheetList.getList(), incStatementList.getList(), cfStatementList.getList(), finMainIndexList.getList());
		logger.info("---------------------insert into income table stock code:" + stock.getCode() + " record count:" + incStatementList.getList().size() + " success---------");
		logger.info("---------------------insert into balance table stock code:" + stock.getCode() + " record count:" + balSheetList.getList().size() + " success---------");
		logger.info("---------------------insert into cash table stock code:" + stock.getCode() + " record count:" + cfStatementList.getList().size() + " success---------");
		logger.info("---------------------insert into financial index table stock code:" + stock.getCode() + " record count:" + finMainIndexList.getList().size() + " success---------");
		Thread.currentThread().sleep(100L);
	}
}

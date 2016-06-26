package com.finreport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
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
	String cookiesKey = "xq_a_token";
	
	@Autowired FinStatementDao finStatementDao;
	
	@Scheduled(fixedRate = 24*60*60*1000)
	public void getFinancialReport() throws InterruptedException {
//		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
//		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 9999));
//		clientHttpRequestFactory.setProxy(proxy);
		
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
			
			int pageSize = 90;
			StockList stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page=1&size=" + pageSize + "&type=11%2C12&access_token=" + token), StockList.class);
			logger.info("---------------------page: " + 1 + " count: " + stockList.getCount());
//			for (Stock stock : stockList.getStocks()) {
//				getFinancialReportBySymbol(stock, restTemplate, token);
//			}
			
			int pageCount = stockList.getCount().getCount()/pageSize + (stockList.getCount().getCount()%pageSize == 0 ? 0 : 1);
			for(int i = 2; i<= pageCount; i++) {
				stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page="+ i +"&size=" + pageSize + "&type=11%2C12&access_token=" + token), StockList.class);
				logger.info("---------------------page: " + i + " count: " + stockList.getCount());
				
				for (Stock stock : stockList.getStocks()) {
					getFinancialReportBySymbol(stock, restTemplate, token);
				}
				
				Thread.currentThread().sleep(100L);
			}
		} catch (IOException | URISyntaxException e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	private void getFinancialReportBySymbol(Stock stock, RestTemplate restTemplate,String token) throws InterruptedException {
		String symbol = stock.getSymbol();
		finStatementDao.addStock(stock);
		logger.info("---------------------insert into stock table stock code:" + stock.getCode() + " success---------");
		IncStatementList incStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/incstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, IncStatementList.class);
		
		for (IncStatement incStatement : incStatementList.getList()) {
			incStatement.setStockcode(stock.getCode());
			finStatementDao.addIncStatement(incStatement);
		}
		
		logger.info("---------------------insert into income table stock code:" + stock.getCode() + " record count:" + incStatementList.getList().size() + " success---------");
		
		BalSheetList balSheetList = restTemplate.getForObject("http://xueqiu.com/stock/f10/balsheet.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, BalSheetList.class);
		for (BalSheet balSheet : balSheetList.getList()) {
			balSheet.setStockcode(stock.getCode());
			finStatementDao.addBalanceStatement(balSheet);
		}
		
		logger.info("---------------------insert into balance table stock code:" + stock.getCode() + " record count:" + balSheetList.getList().size() + " success---------");
		
		CFStatementList cfStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/cfstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, CFStatementList.class);
		for (CFStatement cFStatement : cfStatementList.getList()) {
			cFStatement.setStockcode(stock.getCode());
			finStatementDao.addCFStatement(cFStatement);
		}
		
		logger.info("---------------------insert into cash table stock code:" + stock.getCode() + " record count:" + cfStatementList.getList().size() + " success---------");
		
		FinMainIndexList finMainIndexList = restTemplate.getForObject("http://xueqiu.com/stock/f10/finmainindex.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, FinMainIndexList.class);
		for (FinMainIndex finMainIndex : finMainIndexList.getList()) {
			finMainIndex.setStockcode(stock.getCode());
			finStatementDao.addFinMainIndex(finMainIndex);
		}
		
		logger.info("---------------------insert into financial index table stock code:" + stock.getCode() + " record count:" + finMainIndexList.getList().size() + " success---------");
		Thread.currentThread().sleep(100L);
	}
}

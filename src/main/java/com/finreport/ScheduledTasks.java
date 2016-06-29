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
import org.springframework.web.client.RestClientException;
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

	private final static int retryCount = 3;

	private final static int pageSize = 90;

	@Autowired
	FinStatementDao finStatementDao;

	@Scheduled(fixedRate = 24 * 60 * 60 * 1000)
	public void updateFinancialReportTask() throws InterruptedException {
		try {
			RestTemplate restTemplate = createRestTemplate();
			String token = getToken(restTemplate);
			List<String> insuranceIndustry = getInsuranceStock(restTemplate, token);

			List<String> bankIndustry = getBankStock(restTemplate, token);

			StockList stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page=1&size=1&order=desc&orderby=percent&type=11%2C12&access_token=" + token), StockList.class);
			int totalPage = stockList.getCount().getCount() / pageSize + (stockList.getCount().getCount() % pageSize == 0 ? 0 : 1);
			logger.info("---------------------pagesize: " + pageSize + " count: " + stockList.getStocks().size());

		} catch (Exception e) {

		}
	}

	// @Scheduled(fixedRate = 24*60*60*1000)
	public void createFinancialReportTask() {
		try {
			RestTemplate restTemplate = createRestTemplate();
			String token = getToken(restTemplate);
			List<String> insuranceIndustry = getInsuranceStock(restTemplate, token);

			List<String> bankIndustry = getBankStock(restTemplate, token);

			StockList stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page=1&size=1&order=desc&orderby=percent&type=11%2C12&access_token=" + token), StockList.class);
			int totalPage = stockList.getCount().getCount() / pageSize + (stockList.getCount().getCount() % pageSize == 0 ? 0 : 1);
			logger.info("---------------------pagesize: " + pageSize + " count: " + stockList.getStocks().size());
			insertFinancialReport(restTemplate, token, insuranceIndustry, bankIndustry, 1, totalPage, pageSize);

			List<String> checkList = finStatementDao.getNonfinancialReport();
			for (String symbol : checkList) {
				IncStatementList incStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/incstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, IncStatementList.class);

				if (incStatementList.getList() != null && incStatementList.getList().size() > 0) {
					logger.warn("symbol:" + symbol + " have data");
				}
			}

			logger.info("task execute success end");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	private RestTemplate createRestTemplate() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 9999));
		clientHttpRequestFactory.setProxy(proxy);

		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		// RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	private String getToken(RestTemplate restTemplate) throws IOException, URISyntaxException {
		ClientHttpRequest request = restTemplate.getRequestFactory().createRequest(new URI("http://www.xueqiu.com"), HttpMethod.GET);
		ClientHttpResponse response = request.execute();
		List<String> cookies = response.getHeaders().get("Set-Cookie");
		String token = "";

		for (String item : cookies) {
			String temp = item.split(";")[0];
			if (temp.contains(cookiesKey)) {
				token = temp.replace(cookiesKey + "=", "");
				break;
			}
		}

		return token;
	}

	private List<String> getInsuranceStock(RestTemplate restTemplate, String token) {
		List<String> insuranceIndustry = new ArrayList<String>();

		ResponseEntity<Map> result = restTemplate.getForEntity("http://xueqiu.com/industry/quote_order.json?page=1&size=30&order=desc&exchange=CN&plate=%E4%BF%9D%E9%99%A9%E4%B8%9A&orderBy=percent&level2code=J68&access_token=" + token, Map.class);
		@SuppressWarnings("unchecked") ArrayList<LinkedHashMap<String, String>> list = (ArrayList<LinkedHashMap<String, String>>) result.getBody().get("data");
		for (LinkedHashMap<String, String> item : list) {
			insuranceIndustry.add(item.get(symbol));
		}

		return insuranceIndustry;
	}

	private List<String> getBankStock(RestTemplate restTemplate, String token) {
		List<String> bankIndustry = new ArrayList<String>();
		ResponseEntity<Map> result = restTemplate.getForEntity("http://xueqiu.com/stock/cata/stocklist.json?page=1&size=30&order=desc&orderby=percent&exchange=CN&plate=%E9%93%B6%E8%A1%8C&access_token=" + token, Map.class);
		@SuppressWarnings("unchecked") ArrayList<LinkedHashMap<String, String>> stocksList = (ArrayList<LinkedHashMap<String, String>>) result.getBody().get("stocks");
		for (LinkedHashMap<String, String> item : stocksList) {
			bankIndustry.add(item.get(symbol));
		}

		return bankIndustry;
	}

	private void insertFinancialReport(RestTemplate restTemplate, String token, List<String> insuranceIndustry, List<String> bankIndustry, int begin, int end, int pageSize) throws InterruptedException, RestClientException, URISyntaxException {
		for (int i = begin; i <= end; i++) {
			StockList stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page=" + i + "&size=" + pageSize + "&order=desc&orderby=percent&type=11%2C12&access_token=" + token), StockList.class);
			logger.info("---------------------page: " + i + " count: " + stockList.getStocks().size());

			for (Stock stock : stockList.getStocks()) {
				if (insuranceIndustry.contains(stock.getSymbol())) {
					// to do add insurance stock
				} else if (bankIndustry.contains(stock.getSymbol())) {
					// to do add insurance stock
				} else {
					insertFinancialReportBySymbol(stock, restTemplate, token, retryCount);
				}
			}

			Thread.currentThread().sleep(100L);
		}
	}

	private void updateFinancialReport(RestTemplate restTemplate, String token, List<String> insuranceIndustry, List<String> bankIndustry, int begin, int end, int pageSize) throws InterruptedException, RestClientException, URISyntaxException {
		for (int i = begin; i <= end; i++) {
			StockList stockList = restTemplate.getForObject(new URI("http://xueqiu.com/stock/cata/stocklist.json?page=" + i + "&size=" + pageSize + "&order=desc&orderby=percent&type=11%2C12&access_token=" + token), StockList.class);
			logger.info("---------------------page: " + i + " count: " + stockList.getStocks().size());

			for (Stock stock : stockList.getStocks()) {
				if (insuranceIndustry.contains(stock.getSymbol())) {
					// to do add insurance stock
				} else if (bankIndustry.contains(stock.getSymbol())) {
					// to do add insurance stock
				} else {
					updateFinancialReportBySymbol(stock, restTemplate, token, retryCount);
				}
			}

			Thread.currentThread().sleep(100L);
		}
	}

	private void insertFinancialReportBySymbol(Stock stock, RestTemplate restTemplate, String token, int attempt) {
		try {
			String symbol = stock.getSymbol();
			if (finStatementDao.isStockExist(stock.getCode())) {
				return;
			}
			finStatementDao.addStock(stock);
			logger.info("---------------------insert into stock table stock code:" + stock.getCode() + " success---------");
			IncStatementList incStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/incstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, IncStatementList.class);

			if (incStatementList.getList() != null) {
				List<String> incStatementKey = new ArrayList<String>();
				for (int i = 0; i < incStatementList.getList().size(); i++) {
					IncStatement incStatement = incStatementList.getList().get(i);
					String key = incStatement.getStockcode() + " " + incStatement.getEnddate();
					// void duplicate key.
					if (incStatementKey.contains(key)) {
						incStatementList.getList().remove(i);
						i--;
						continue;
					}
					incStatementKey.add(key);
					incStatement.setStockcode(stock.getCode());
				}
			}

			BalSheetList balSheetList = restTemplate.getForObject("http://xueqiu.com/stock/f10/balsheet.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, BalSheetList.class);

			List<String> balSheetKey = new ArrayList<String>();
			if (balSheetList.getList() != null) {
				for (int i = 0; i < balSheetList.getList().size(); i++) {
					BalSheet balSheet = balSheetList.getList().get(i);
					String key = balSheet.getStockcode() + " " + balSheet.getReportdate();
					// void duplicate key.
					if (balSheetKey.contains(key)) {
						balSheetList.getList().remove(i);
						i--;
						continue;
					}
					balSheetKey.add(key);
					balSheet.setStockcode(stock.getCode());
				}
			}

			CFStatementList cfStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/cfstatement.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, CFStatementList.class);

			List<String> cfStatementKey = new ArrayList<String>();
			if (cfStatementList.getList() != null) {
				for (int i = 0; i < cfStatementList.getList().size(); i++) {
					CFStatement cfStatement = cfStatementList.getList().get(i);
					String key = cfStatement.getStockcode() + " " + cfStatement.getEnddate();
					// void duplicate key.
					if (cfStatementKey.contains(key)) {
						cfStatementList.getList().remove(i);
						i--;
						continue;
					}
					cfStatementKey.add(key);
					cfStatement.setStockcode(stock.getCode());
				}
			}

			FinMainIndexList finMainIndexList = restTemplate.getForObject("http://xueqiu.com/stock/f10/finmainindex.json?symbol=" + symbol + "&page=1&size=1000&access_token=" + token, FinMainIndexList.class);

			List<String> finMainIndexKey = new ArrayList<String>();
			if (finMainIndexList.getList() != null) {
				for (int i = 0; i < finMainIndexList.getList().size(); i++) {
					FinMainIndex finMainIndex = finMainIndexList.getList().get(i);
					String key = finMainIndex.getStockcode() + " " + finMainIndex.getReportdate();
					// void duplicate key.
					if (finMainIndexKey.contains(key)) {
						finMainIndexList.getList().remove(i);
						i--;
						continue;
					}
					finMainIndexKey.add(key);
					finMainIndexList.getList().get(i).setStockcode(stock.getCode());
				}
			}

			finStatementDao.batchAddFinancialReport(balSheetList.getList(), incStatementList.getList(), cfStatementList.getList(), finMainIndexList.getList());

			logger.debug("---------------------insert into income table stock code:" + stock.getCode() + " record count:" + (incStatementList.getList() != null ? incStatementList.getList().size() : 0) + " success---------");
			logger.debug("---------------------insert into balance table stock code:" + stock.getCode() + " record count:" + (balSheetList.getList() != null ? balSheetList.getList().size() : 0) + " success---------");
			logger.debug("---------------------insert into cash table stock code:" + stock.getCode() + " record count:" + (cfStatementList.getList() != null ? cfStatementList.getList().size() : 0) + " success---------");
			logger.debug("---------------------insert into financial index table stock code:" + stock.getCode() + " record count:" + (finMainIndexList.getList() != null ? finMainIndexList.getList().size() : 0) + " success---------");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			if (attempt > 0) {
				finStatementDao.deleteStock(stock.getCode());
				insertFinancialReportBySymbol(stock, restTemplate, token, --attempt);
			} else {
				// throw e;
				logger.error("insert stock : " + stock + " failure");
			}
		}
	}

	private void updateFinancialReportBySymbol(Stock stock, RestTemplate restTemplate, String token, int attempt) {
		try {
			String symbol = stock.getSymbol();
			if (!finStatementDao.isStockExist(stock.getCode())) {
				logger.info("---------------------insert into stock table stock code:" + stock.getCode() + " success---------");
				finStatementDao.addStock(stock);
			} else {
				finStatementDao.updateStock(stock);
			}

			IncStatementList incStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/incstatement.json?symbol=" + symbol + "&page=1&size=1&access_token=" + token, IncStatementList.class);

			if (incStatementList.getList() != null && incStatementList.getList().size() > 0) {
				incStatementList.getList().get(0).setStockcode(stock.getCode());
				
				if (!finStatementDao.isIncStatementExist(stock.getCode(), incStatementList.getList().get(0).getEnddate())) {
					finStatementDao.addIncStatement(incStatementList.getList().get(0));
					logger.debug("---------------------insert into income table stock code:" + stock.getCode() + " report date:" + incStatementList.getList().get(0).getEnddate() + " success---------");
				}
			}

			BalSheetList balSheetList = restTemplate.getForObject("http://xueqiu.com/stock/f10/balsheet.json?symbol=" + symbol + "&page=1&size=1&access_token=" + token, BalSheetList.class);

			if (balSheetList.getList() != null && balSheetList.getList().size() > 0) {
				balSheetList.getList().get(0).setStockcode(stock.getCode());
				
				if (!finStatementDao.isBalanceStatementExist(stock.getCode(), balSheetList.getList().get(0).getReportdate())) {
					finStatementDao.addBalanceStatement(balSheetList.getList().get(0));
					logger.debug("---------------------insert into balance table stock code:" + stock.getCode() + " report date:" + balSheetList.getList().get(0).getReportdate() + " success---------");
				}
			}

			CFStatementList cfStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/cfstatement.json?symbol=" + symbol + "&page=1&size=1&access_token=" + token, CFStatementList.class);

			if (cfStatementList.getList() != null && cfStatementList.getList().size() > 0) {
				cfStatementList.getList().get(0).setStockcode(stock.getCode());
				
				if (!finStatementDao.isCFStatementExist(stock.getCode(), cfStatementList.getList().get(0).getEnddate())) {
					finStatementDao.addCFStatement(cfStatementList.getList().get(0));
					logger.debug("---------------------insert into cash table stock code:" + stock.getCode() + " report date:" + cfStatementList.getList().get(0).getEnddate() + " success---------");
				}
			}

			FinMainIndexList finMainIndexList = restTemplate.getForObject("http://xueqiu.com/stock/f10/finmainindex.json?symbol=" + symbol + "&page=1&size=1&access_token=" + token, FinMainIndexList.class);

			if (finMainIndexList.getList() != null && finMainIndexList.getList().size() > 0) {
				finMainIndexList.getList().get(0).setStockcode(stock.getCode());
				
				if (!finStatementDao.isFinMainIndexExist(stock.getCode(), finMainIndexList.getList().get(0).getReportdate())) {
					finStatementDao.addFinMainIndex(finMainIndexList.getList().get(0));
					logger.debug("---------------------insert into financial index table stock code:" + stock.getCode() + " report date:" + finMainIndexList.getList().get(0).getReportdate() + " success---------");
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			if (attempt > 0) {
				finStatementDao.deleteStock(stock.getCode());
				insertFinancialReportBySymbol(stock, restTemplate, token, --attempt);
			} else {
				// throw e;
				logger.error("insert stock : " + stock + " failure");
			}
		}
	}
}

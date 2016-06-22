package hello;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTasks {

	Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	String cookiesKey = "xq_a_token";
	
	@Scheduled(fixedRate = 24*60*60*1000)
	public void getFinancialReport() {
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
				 }
			}
			IncStatementList incStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/incstatement.json?symbol=SZ002353&page=1&size=4&access_token=" + token, IncStatementList.class);
			for (IncStatement incStatement : incStatementList.getList()) {
				System.out.println(incStatement);
			}
			
			BalSheetList balSheetList = restTemplate.getForObject("http://xueqiu.com/stock/f10/balsheet.json?symbol=SZ002353&page=1&size=4&access_token=" + token, BalSheetList.class);
			for (BalSheet balSheet : balSheetList.getList()) {
				System.out.println(balSheet);
			}
			
			CFStatementList cfStatementList = restTemplate.getForObject("http://xueqiu.com/stock/f10/cfstatement.json?symbol=SZ002353&page=1&size=4&access_token=" + token, CFStatementList.class);
			for (CFStatement cFStatement : cfStatementList.getList()) {
				System.out.println(cFStatement);
			}
			
			FinMainIndexList finMainIndexList = restTemplate.getForObject("http://xueqiu.com/stock/f10/finmainindex.json?symbol=SZ002353&page=1&size=4&access_token=" + token, FinMainIndexList.class);
			for (FinMainIndex finMainIndex : finMainIndexList.getList()) {
				System.out.println(finMainIndex);
			}
			
		} catch (IOException | URISyntaxException e) {
			logger.error(e.getMessage(), e);
		}
	}
}

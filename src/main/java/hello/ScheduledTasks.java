package hello;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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
//			//http://xueqiu.com/stock/f10/finmainindex.json?symbol=SH601988&page=2&size=4&_=1466526456836
//			//http://xueqiu.com/stock/f10/incstatement.json?symbol=SZ002353&page=1&size=4&_=1466527285322
//			restTemplate.getRequestFactory().createRequest(arg0, arg1)
//			request = restTemplate.getRequestFactory().createRequest(new URI("http://xueqiu.com/stock/f10/incstatement.json?symbol=SZ002353&page=1&size=4&_=1466527285322"), HttpMethod.GET);
			ResponseEntity<Object> obj = restTemplate.getForEntity("http://xueqiu.com/stock/f10/incstatement.json?symbol=SZ002353&page=1&size=1000&access_token=" + token, Object.class);
			System.out.println(obj);
			Object list = ((LinkedHashMap)obj.getBody()).get("list");
		} catch (IOException | URISyntaxException e) {
			logger.error(e.getMessage(), e);
		}
	}
}

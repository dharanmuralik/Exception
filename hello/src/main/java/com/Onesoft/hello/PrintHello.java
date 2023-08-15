package com.Onesoft.hello;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PrintHello {
	RestTemplate rest=new RestTemplate();
	
	@GetMapping(value="/gethellohi")
	public String getHiHello()
	{
		String url="http://localhost:8081/admin/getHiviaHello";
		ResponseEntity<String> response=rest.exchange(url, HttpMethod.GET, null, String.class);
		
		String value=response.getBody();
		return value;
	}
	


}

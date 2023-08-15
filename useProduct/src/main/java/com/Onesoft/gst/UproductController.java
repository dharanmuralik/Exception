package com.Onesoft.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UproductController {
	
	@Autowired
	//UproductService prSer;
	
	RestTemplate res;
	//  RestTemplate res=new RestTemplate();
    ParameterizedTypeReference<List<Product>>  parameterizedTypeReference = new ParameterizedTypeReference<List<Product>>(){};
	
	@GetMapping(value="/getCarviaEmployee")
	
	public List<Product> getProductplusGst(){
		
		String url1="http://localhost:8080/findAll";
		String url2="http://localhost:8081/getPercentageByhsn/";
	//	List<Product> product=prSer.getAll();
		
		ResponseEntity<List<Product>> response1=res.exchange(url1, HttpMethod.GET,null,parameterizedTypeReference);
		
		List<Product> pros=response1.getBody();
		
		for(Product p: pros)
		{
			int hsn=p.getHsncode();
			ResponseEntity<Integer> response2=res.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
			int percentage=response2.getBody();
			p.setPrice(p.getPrice()+p.getPrice()*percentage/100);
		}
		
				
		
		return  pros;
	}
	
	
	

	
	
	

}

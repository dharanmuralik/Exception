package com.Onesoft.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService proSer;
	
	@GetMapping(value="/findAll")
	public List<Product> getAll()
	{
		return proSer.getAll();
	}

}

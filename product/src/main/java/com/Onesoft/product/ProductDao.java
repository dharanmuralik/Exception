package com.Onesoft.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository prodRepo;
	
	public List<Product> getAll()
	{
		return prodRepo.findAll();
	}
	
}

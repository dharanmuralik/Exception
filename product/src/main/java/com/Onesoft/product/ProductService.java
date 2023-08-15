package com.Onesoft.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao prodDao;
	
	public List<Product> getAll()
	{
		return prodDao.getAll();
	}

}

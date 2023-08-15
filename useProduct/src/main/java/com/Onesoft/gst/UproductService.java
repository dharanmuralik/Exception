package com.Onesoft.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UproductService {

	@Autowired
	UproductDao updao;
	public List<Product> getAll()
	{
		return updao.getAll();
	}
	
	

}

package com.Onesoft.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UproductDao {
	
	@Autowired
	UproductRepository urepo;
	
	public List<Product> getAll()
	{
		return urepo.findAll();
	}

}

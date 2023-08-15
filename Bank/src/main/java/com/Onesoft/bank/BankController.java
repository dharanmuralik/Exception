package com.Onesoft.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
 @Autowired
 BankService bSer;
	
	@GetMapping(value="/findifscbybank/{branch}")
	
	public String getBank(@PathVariable String branch)
	{
		return  bSer.getBank(branch);
	} 
	
	/*
	@GetMapping(value="/finAll")
	public List<Bank> getAll()
	{
		return bSer.getAll();
	}
	*/
}

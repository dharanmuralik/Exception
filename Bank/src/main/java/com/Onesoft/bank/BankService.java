package com.Onesoft.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BankService {

	
	@Autowired
	BankDao bDao;
	

	public String getBank(@PathVariable String branch)
	{
		return  bDao.getBank(branch);
	} 
	
/*	public List<Bank> getAll()
	{
		return bDao.getAll();
	}
	*/
}

package com.Onesoft.studentResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
	
	@Autowired
	ResultDao rDao;
	
	public Result getStudentResults(Result r)
	{
		return rDao.getStudentResults(r);
	}

	
	
	public List<Result> getAll()
	{
		return rDao.getAll();
	}
	
	public Result getTopper(Result r)
	{
		return rDao.getTopper(r);
	}
	
	public List<Result> getTop3 ()
	{
		return rDao.getTop3();
	}
	
	public List<Result> getPercenatage()
	{
		return rDao.getPercenatage();
	}
 	
	
	
}

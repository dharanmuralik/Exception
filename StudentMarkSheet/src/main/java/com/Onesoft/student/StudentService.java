package com.Onesoft.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	
	@Autowired
	StudentDao stdDao;
	
	public Student totalMarks(@RequestBody Student std)
	{
		return stdDao.totalMarks(std);
	}
	
	public Student getMark( int id)
	{
		
		return stdDao.getMark(id);
	}

}

package com.Onesoft.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	 StudentDao stdDao;
	
	public String addStudent(Student1 std) throws NotAValidAgeException
	{
		return  stdDao.addStudent(std);
	}

	
	public Student1 getStudent( int id)
	{
		return stdDao.getStudent(id);
	}
	
	public String updateStudent( Student1 std)
	{
		return  stdDao.updateStudent(std);
	}
	
	
	public String deleteStudent( int id)
	{
		return stdDao.deleteStudent(id);
	}
	
	public List<Student1> getAll()
	{
		return stdDao.getAll();
	}
	
	
}

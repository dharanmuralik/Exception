package com.Onesoft.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository stdRepo;
	
	public Student totalMarks( Student std)
	{
		Student s1=std;
		s1.setSem1Total(s1.getSem1Practicals()+s1.getSem1Theory());
		s1.setSem2Total(s1.getSem2Practicals()+s1.getSem2Theory());
		stdRepo.save(s1);
		return s1;
	}
	
	
	public Student getMark( int id)
	{
		Student s1=stdRepo.findById(id).get();
		return s1;
	}

}

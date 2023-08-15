package com.Onesoft.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stdSer;
	
	@PostMapping(value="/TotalMarks")
	
	public Student totalMarks(@RequestBody Student std)
	{
		return stdSer.totalMarks(std);
	}

	@GetMapping(value="/getStudentmark/{id}")
	public Student getMark(@PathVariable int id)
	{
		
		return stdSer.getMark(id);
	}
	
}

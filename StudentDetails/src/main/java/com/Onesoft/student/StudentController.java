package com.Onesoft.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stdSer;
	
	@PostMapping(value="/addStudent")
	public String addStudent(@RequestBody Student1 std) throws NotAValidAgeException

	{
		return stdSer.addStudent(std);
	}
	
	@GetMapping(value="/getStudent/{id}")
	
	public Student1 getStudent(@PathVariable int id)
	{
		return stdSer.getStudent(id);
	}
	
	
	@GetMapping(value="/deleteStudent/{id}")
	
	public String deleteStudent(@PathVariable int id)
	{
		return stdSer.deleteStudent(id);
	}
	
	
	@PutMapping(value="/update")
	
	public String updateStudent(@RequestBody Student1 std)
	{
		return  stdSer.updateStudent(std);
	}
	
	
	@GetMapping(value="getAll")
	
	public List<Student1> getAll()
	{
		return stdSer.getAll();
	}
	
}

package com.Onesoft.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository stdRepo;

	public String addStudent(Student1 std) throws NotAValidAgeException {
		try {
			// Student s1= stdRepo.save(std);
			if (std.getAge() < 18) {
				throw new NotAValidAgeException(" Only Valid Age is Allowed");
			}

			else {
				Student1 s1 = stdRepo.save(std);
				return "Added Successfully";
			}
		} catch (NotAValidAgeException ae) {
			return ae.getMessage();

		}

	}

	public Student1 getStudent(int id) {
		Student1 std = stdRepo.findById(id).get();
		return std;
	}

	public String deleteStudent(int id) {
		Student1 std = stdRepo.findById(id).get();
		stdRepo.delete(std);
		return "Selected id successfuly delted";
	}

	public String updateStudent(Student1 std) {
		stdRepo.save(std);

		return "Updated Successfully";
	}
	
	
	
	public List<Student1> getAll()
	{
		return stdRepo.findAll();
	}

}

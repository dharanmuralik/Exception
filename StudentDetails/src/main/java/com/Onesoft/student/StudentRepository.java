package com.Onesoft.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student1, Integer> {

	
	@Query(value="select * from student_details where id=?",nativeQuery =true )
	public String  deleteStudent( int id);
}

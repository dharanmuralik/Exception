package com.Onesoft.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
	@Query(value="select * from employee_details where salary>=?",nativeQuery  =true)
	
	List<Employee> getEmployeeBySalary(int salary);

	
	
 @Query(value="select * from employee_details where age>=?",nativeQuery  =true)
	
	List<Employee> getEmployeeByAge(int age);
 
 
 
 
 
 @Query(value="select * from employee_details where name like %?",nativeQuery  =true)
	
	List<Employee> getEmployeeByName(String name);
 
 
 
  @Query(value="select max(salary) from employee_details ",nativeQuery=true)
    int getMaximumSalary();
  
 /* 
  @Query(value="select * from employee_details where age<?",nativeQuery=true )
  String getAge(Employee e);
  */
  
  @Query(value="select * from employee_details where age=?",nativeQuery=true)
  List<Employee>getEmpByAge(int age);
}

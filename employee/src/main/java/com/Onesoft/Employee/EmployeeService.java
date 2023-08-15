package com.Onesoft.Employee;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empDao;

	public String addEmployee(Employee e) {
		return empDao.addEmployee(e);
	}

	public Employee getEmployee(int id) {
		return empDao.getEmployee(id);
	}

	public String postEmployee(List<Employee> e) {
		return empDao.postEmployee(e);
	}

	public List<Employee> findEmployee() {
		return empDao.findEmployee();
	}

	public String deleteEmployee(int id) {
		return empDao.deleteEmployee(id);
	}

	public String updateEmployee(Employee e) {
		return empDao.updateEmployee(e);
	}

	public String deleteeAll() {
		return empDao.deleteeAll();

	}

	public List<Employee> getIncreasedSalary() {
		List<Employee> li = empDao.getIncreasedSalary();

		return li.stream().map(X -> {

			if (X.getAge() >= 30 && X.getAge() <= 35) {
				X.setSalary(X.getSalary() + X.getSalary() * 10 / 100);

				// return X;
			}

			if (X.getAge() > 35 && X.getAge() <= 40) {
				X.setSalary(X.getSalary() + X.getSalary() * 15 / 100);

				// return X;
			}

			if (X.getAge() > 40 && X.getAge() <= 50) {
				X.setSalary(X.getSalary() + X.getSalary() * 20 / 100);
				// return X;
			}
			return X;

		}).collect(Collectors.toList());
	}

	// *********GetBy NAME*****/////

/*	public List<Employee> getByName(String name) {

		List<Employee> li = empDao.getByName();

		return li.stream().filter(X -> X.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

	}
*/
	// *****GET BY GENDER*****///

	public List<Employee> getByGender(String gender) {
		List<Employee> li = empDao.getByGender();
		return li.stream().filter(X -> X.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());

	}

	// *******GET BY ID****************//

	public List<Employee> getById(int id) {
		List<Employee> li = empDao.getById();

		return li.stream().filter(X -> X.getId() == id).collect(Collectors.toList());

	}

	public List<Employee> getEmployeeBySalary(int salary) {
		return empDao.getEmployeeBySalary(salary);
	}

	public List<Employee> getEmployeeByAge(@PathVariable int age) {

		return empDao.getEmployeeByAge(age);
	}

	public List<Employee> getEmployeeByName(String name) throws NameNotFoundException {
		// **List<Employee> li=empDao.getEmployeeByName(name)****//

	
			if ((empDao.getEmployeeByName(name)).isEmpty()) {
				throw new NameNotFoundException("NO NAME FETCHED");
			} else {
				return empDao.getEmployeeByName(name);
			}
		

	
	}

	public int getMaximumSalary() {

		return empDao.getMaximumSalary();
	}

	public String getAge(Employee e) throws AgeException {
		try {
			if (e.getAge() < 18) {

				throw new AgeException("Not a valid Age");
			}

			else {
				return empDao.getAge(e);
			}

		}

		catch (AgeException ae) {

			return ae.getMessage();
		}

	}
	
	
	/////GETBYAGEE EXP***************///////////
	
	public List<Employee> getEmpByAge(int age) throws NoAgeNameFound
	{
		List<Employee> li=empDao.getEmpByAge(age);
		
		//List<Employee> lii=li.stream().filter(X->X.getAge()==age).collect(Collectors.toList());
		
		if(li.isEmpty())
		{
			throw new NoAgeNameFound("NO AGE EMPLOYEE FOUND");
		}
		else
		{
		return	empDao.getEmpByAge(age);
		
		}
	
	}
	/////***********GET BY SALARY*********////////
	
	

}

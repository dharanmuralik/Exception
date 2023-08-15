package com.Onesoft.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptions {
	
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> nameNotFoundHandling(NameNotFoundException n)
	{
		return new ResponseEntity<> (n.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoAgeNameFound.class)
	public ResponseEntity<Object> NoAgeNameFound(NoAgeNameFound n)
	{
		return new ResponseEntity<> (n.getMessage(),HttpStatus.NOT_FOUND);
	} 

}

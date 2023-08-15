package com.Onesoft.Hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping(value="/admin")
public class PrintHi {
	
		
	
	
	
	@GetMapping(value="/getHiviaHello")
	public String print(String name)
	{
		name="HIIII";
		System.out.println("svwewcac");
		return name;
	}
}

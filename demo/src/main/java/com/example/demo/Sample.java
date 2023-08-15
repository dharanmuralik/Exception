package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class Sample {

	@GetMapping(value = "/getHello")

	public String toString() {
		return "Hello World";
	}

	@GetMapping(value = "/total/{a}/{b}")
	public int getTotal(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	/*
	 * public String printValue(@PathVariable String a,@PathVariable String
	 * b,@PathVariable String c) {
	 * 
	 * int a1=Integer.parseInt(a.charAt(a.length()-1)); for()
	 * 
	 * 
	 * }
	 * 
	 */

	@GetMapping(value = "/Prime/{a}")
	public String primeValue(@PathVariable int a) {

		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}

		}

		if (count == 0) {
			return " PRIME";
		} else {
			return "Not Prime";
		}

	}

	@GetMapping(value = "/Palindrome/{a}")

	public String palindrome(@PathVariable String a) {
		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}

		if (a.equals(b)) {
			return "Palindrome";
		} else {
			return "Not a Palindrome";
		}
	}

	@GetMapping(value="/PrimebtwnNo/{a}/{b}")
	public List<Integer> primeValueNo(@PathVariable int a,@PathVariable int b) {
		
		List<Integer> li=new ArrayList<>();
	     
	     int flag=0;
     	for(int i=a;i<b;i++)     //2       7
	   {
     	for(int j=2;j<i;j++)
     	{
		
		if(i%j==0)
		{
			flag=0;
			break;
			
		}
		else
		{
			flag=1;
		}
     	}
	   
		if(flag==1)
			{
				li.add(i);
			}
			
	
		}
	   
	   
		
	return li;

}


	
	
	@GetMapping(value = "/fib/{n}")
	public List<Integer> fibonacci(@PathVariable int n )
	{
		List<Integer> li=new ArrayList<>();
		
		int a=0;
		li.add(a);
		int b=1;
		li.add(b);
		
		
		for(int i=1;i<n;i++)
		{
	         int c=a+b;
	         li.add(c);
	         a=b;
	         b=c;
		}
		return li;
		
	
	}
	

	@GetMapping(value="/checkuserandpassword")
	
	public String getAccess(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("mark") && password.equals("antony"))
		{
			return "Accessed";
		}
		else
		{
			return "Denied";
		}
	}
	
	@GetMapping(value="/getCar/{tax}")
	
	public Car getCar(@RequestBody Car c,@PathVariable int tax)
	{
		c.setPrice(c.getPrice()+c.getPrice()*tax/100);
		return c;
	}
	
	
	@GetMapping(value="/setList")
	public List<Car> getCars(@RequestBody List<Car> cars)
	{
		return cars;
	}
	
	///Get Brand///
	
	@GetMapping(value="/getBrand")
	
	public List<Car> getbrand(@RequestBody List<Car> cars)
	{
		//ArrayList <Car> li=new ArrayList<>();
		
		List <Car> li=cars.stream().filter(X->(X.getBrand().equals("Audi"))).map(X-> {
			X.setPrice(X.getPrice()+X.getPrice()*18/100);
			return X;
		}).collect(Collectors.toList());
		
		return li;
	}
		
	
  ///Black car price+50000000
	
	@GetMapping(value="/getBlack")
	
	public List<Car> getBlackCar(@RequestBody List<Car> cars)
	{
		List<Car> li=cars.stream().filter(X->(X.getColor().equalsIgnoreCase("Black"))).map(X->{
			
			X.setPrice(X.getPrice()+5000000);
			return X;
		}).collect(Collectors.toList());
		
		return li;
	}
	
	///Get Minimum Price//
	
	@GetMapping(value="/getMin")
	public String getMin(@RequestBody List<Car> cars)
	{
		String li=cars.stream().min(Comparator.comparing(Car::getPrice)).get().getBrand();
				
		
		return li;
	}
	
	
	///GetMaximum Price///
	
	@GetMapping(value="/GetMax")
	
	public Car getMax(@RequestBody List<Car> cars)
	{
		Car li=cars.stream().max(Comparator.comparing(Car::getPrice)).get();
		
		return li;
	}
	
	
}

package com.Onesoft.studentResult;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultController {

	RestTemplate rest=new RestTemplate();
	

	
	@Autowired
	ResultService rSer;
	
	
	@PostMapping(value="/studentfinalmarksheet")
	public Result  getStudentResults(@RequestBody Result r1,@RequestParam int id)
	{
		
		
		String url1="http://localhost:8090/getStudent/";
	     ResponseEntity<Student1> res=rest.exchange(url1+id, HttpMethod.GET,  null,Student1.class );
		
		 Student1 value1=res.getBody();
		
		
		String url2="http://localhost:8080/getStudentmark/";
		
	//Result r1=new Result();
	
      ResponseEntity<Student> res2=rest.exchange(url2+id, HttpMethod.GET,null,Student.class);
		
	 	Student value2=res2.getBody();
	 	
	 	
	    r1.setId(value2.getId());
	 	r1.setName(value1.getName());
	    r1.setRollNumber(value2.getRollnumber());
	    
	    if((value1.getAttendance()* 2)>90)
	    {
	    	
	     r1.setTotalMarks((value2.getSem1Total()+value2.getSem2Total())+5);
	    }
	    else
	    {
	    	 r1.setTotalMarks(value2.getSem1Total()+value2.getSem2Total());
	    }
	    
	 	
	 	r1.setPercentage((value2.getSem1Total()+value2.getSem2Total())/2);
	 	
	 	return rSer.getStudentResults(r1);
	 	
	 	
		
		
	 	
/*	List<Student> ff;
	
	    for(Student1 id :value)
	    {
		
		ResponseEntity<Student> res2=rest.exchange(url2+id.getId(), HttpMethod.GET,null,Student.class);
		
	 	Student value2=res2.getBody();
		
		 r1.setId(value2.getId());
		// r1.setName(value2.get);
		 //r1.setPercentage(value2.);
		r1.setRollNumber(value2.getRollnumber());
		
		r1.setTotalMarks(value2.getSem1Total()+value2.getSem2Total());
		r1.setName(id.getName());
		r1.setPercentage(id.getAttendance()/100);
		r1.setTotalMarks(value2.getSem1Total()+value2.getSem2Total());
		
	    rSer.getStudentResults(value2);
	   
	    }
	    
	    */
	    
	 
		
	}
	
	@GetMapping (value="/getAll")
	public List<Result> getAll()
	{
		return rSer.getAll();
	}
	
	
	@GetMapping(value="/Topper")
	public Result getTopper(Result r)
	{
		return rSer.getTopper(r);
	}
 	
 	
	@GetMapping(value="/gettop3")
	public List<Result> getTop3 ()
	{
		return rSer.getTop3();
	}
	
	@GetMapping(value="/percentagebetween80and100")
	
	public List<Result> getPercenatage()
	{
		return rSer.getPercenatage();
	}
	
	
	
}

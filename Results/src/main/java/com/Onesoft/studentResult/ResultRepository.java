package com.Onesoft.studentResult;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResultRepository extends JpaRepository<Result, String> {

	
    @Query(value="select * from result_table where totalmarks=(select max(totalmarks) from result_table) ",nativeQuery = true)
	public Result getTopper(Result r);
	

    
    @Query(value="select * from  results.result_table order by totalmarks desc limit 3",nativeQuery = true)
    public List<Result> getTop3();
    
    
    @Query(value="Select * from result_table where percentage between 80 and 100",nativeQuery =true)
    public  List<Result> getPercenatage();
    
}

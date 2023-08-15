package com.Onesoft.Vehicle.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.Vehicle.entity.Bike;
import com.Onesoft.Vehicle.repository.BikeRepository;

@Repository
public class BikeDao {

	
	@Autowired
	BikeRepository bikeRepo;
	
	public String vehicleAdd(@RequestBody Bike b)
	{
		bikeRepo.save(b);
		return "Succesfully Added";
	}

	
	
}

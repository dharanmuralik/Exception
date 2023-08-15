package com.Onesoft.Vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.Vehicle.dao.BikeDao;
import com.Onesoft.Vehicle.entity.Bike;

@Service
public class BikeService {
	@Autowired
	
	BikeDao bikeDao;
	
	public String vehicleAdd(@RequestBody Bike b)
	{
		return  bikeDao.vehicleAdd(b);
	}


}

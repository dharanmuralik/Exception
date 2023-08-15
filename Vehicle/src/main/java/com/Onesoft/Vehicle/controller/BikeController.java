package com.Onesoft.Vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Onesoft.Vehicle.entity.Bike;
import com.Onesoft.Vehicle.service.BikeService;

@RestController
@RequestMapping(value="/bike")

public class BikeController {
	
	
	@Autowired
	BikeService bikeSer;
	
	@PostMapping(value="/add")
	public String vehicleAdd(@RequestBody Bike b)
	{
		return  bikeSer.vehicleAdd(b);
	}

}

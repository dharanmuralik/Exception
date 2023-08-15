package com.Onesoft.Vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Onesoft.Vehicle.entity.CarEntity;
import com.Onesoft.Vehicle.repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository carRepo;

	public String vehicleAdd(CarEntity v) {
		carRepo.save(v);
		return "Successfully Added";
	}

	public String vehicledeleteAll() {
		carRepo.deleteAll();

		return "Table Cleared Successfully";
	}

	public String vehicleUpdate(CarEntity c) {
		carRepo.save(c);
		return "Updated Successfully";
	}

	public String vehicleAddAll(List<CarEntity> c) {
		carRepo.saveAll(c);
		return "List Inserted Successfully";
	}

	public List<CarEntity> getAll() {
		return carRepo.findAll();
	}

	public CarEntity getvalue(int id) {
		return carRepo.findById(id).get();
	}
	
	
	public List<CarEntity> getAllBrands()
	{
		return carRepo.findAll();
	}
	
	
	public List<CarEntity> getCarByBrand(String brand)
	{
		return carRepo.findAll();
	}
	
}

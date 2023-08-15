package com.Onesoft.Vehicle.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.Vehicle.dao.CarDao;
import com.Onesoft.Vehicle.entity.CarEntity;

@Service
public class CarService {

@Autowired

CarDao carD;

public String vehicleAdd(CarEntity v)
{
	return carD.vehicleAdd(v);
}

public String vehicledeleteAll()
{
	return carD.vehicledeleteAll();
}

public String vehicleUpdate(CarEntity c)
{
	return carD.vehicleUpdate(c);
}

public String vehicleAddAll(@RequestBody List<CarEntity> c)
{
	return carD.vehicleAddAll(c);
}

public List<CarEntity> getAll()
{
	return carD.getAll();
}

public CarEntity getvalue( int id)
{
	return carD.getvalue(id);
}


public List<String> getAllBrand()
{
	List<CarEntity> li=carD.getAll();
	
	return li.stream().map(X->X.getBrand()).collect(Collectors.toList());
}



public List<CarEntity> getCarByBrand(String brand)
{
	List<CarEntity> li=carD.getAll();
	
	return li.stream().filter(X->X.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
	
}

}

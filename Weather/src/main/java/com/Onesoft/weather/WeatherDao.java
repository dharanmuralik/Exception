package com.Onesoft.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WeatherDao {
	
	@Autowired
	WeatherRepository wRepo;
	
	public String updateWeather(List<Weather> w)
	{
		wRepo.findAll();
		wRepo.saveAll(w);
		
		return "Successfully Updated";
	}

}

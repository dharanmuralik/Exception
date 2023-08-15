package com.Onesoft.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService wSer;
	
	@PutMapping
	public String updateWeather(@RequestBody List<Weather> w)
	{
		return wSer.updateWeather(w);
	}

}

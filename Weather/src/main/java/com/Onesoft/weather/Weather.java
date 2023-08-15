package com.Onesoft.weather;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="weather_details")
public class Weather {
	
	@Id
	private String id;
	private String city;
	private int temperature;
	private String wind;
	private int totalrainfall;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public int getTotalrainfall() {
		return totalrainfall;
	}
	public void setTotalrainfall(int totalrainfall) {
		this.totalrainfall = totalrainfall;
	}
	
	
	
	

}

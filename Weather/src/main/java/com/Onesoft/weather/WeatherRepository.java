package com.Onesoft.weather;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository  extends JpaRepository<Weather,String>{

}

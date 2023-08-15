package com.Onesoft.Vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Onesoft.Vehicle.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}

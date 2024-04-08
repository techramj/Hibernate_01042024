package com.seed.dao;

import com.seed.entities.Car;

public interface CarDao {
	
	Car save(Car car);
	Car update(Car car);
	void delete(int id);
	Car findById(int id);
	Car findAll();

}

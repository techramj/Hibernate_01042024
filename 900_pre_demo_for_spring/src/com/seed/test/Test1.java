package com.seed.test;

import com.seed.model.Bike;
import com.seed.model.Car;
import com.seed.model.Employee;
import com.seed.model.Jeep;

public class Test1 {
	
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Sam", 1000);
		Bike bike = new Bike("RE", "Black");
		Car car = new Car("BMW", "Blue");
		Jeep jeep = new Jeep("Thar",  "Black");
		emp.setVehicle(jeep);
	}

}

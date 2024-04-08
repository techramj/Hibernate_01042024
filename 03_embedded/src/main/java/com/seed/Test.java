package com.seed;

import com.seed.dao.CarDao;
import com.seed.dao.EmployeeDao;
import com.seed.dao.impl.CarDaoImpl;
import com.seed.dao.impl.EmployeeDaoImpl;
import com.seed.entities.Address;
import com.seed.entities.Car;
import com.seed.entities.Employee;

public class Test {
	
	private static EmployeeDao empDao = new EmployeeDaoImpl();
	private static CarDao carDao = new CarDaoImpl();
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("jack");
		emp.setSalary(1000.0);
		Address add1 = new Address();
		add1.setCity("Pune");
		add1.setPincode("411011");
		emp.setAddress(add1);
		
		Employee emp2 = new Employee();
		emp2.setName("Jessica");
		emp2.setSalary(5000.0);
		Address add2 = new Address();
		add2.setCity("Mumbai");
		add2.setPincode("111011");
		emp2.setAddress(add2);
		
		Car car1 = new Car();
		car1.setName("BMW");
		
		
		Car car2 = new Car();
		car2.setName("GV");
		
		empDao.save(emp);
		
		carDao.save(car1);
		
		empDao.save(emp2);
		
		carDao.save(car2);
		
	}

}

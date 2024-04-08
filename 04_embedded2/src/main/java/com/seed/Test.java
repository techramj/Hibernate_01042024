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
		
		Address billingAdd = new Address();
		billingAdd.setCity("Pune");
		billingAdd.setPincode("411011");
		
		Address mailAdd = new Address();
		mailAdd.setCity("Pune");
		mailAdd.setPincode("411011");
		
		Address permAdd = new Address();
		permAdd.setCity("Pune");
		permAdd.setPincode("411011");
		
		emp.setBillingAddress(billingAdd);
		emp.setMailingAddress(mailAdd);
		emp.setPermanentAddress(permAdd);
		
		
		
		empDao.save(emp);

		
	}

}

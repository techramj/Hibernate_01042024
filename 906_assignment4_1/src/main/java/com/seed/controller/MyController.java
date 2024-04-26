package com.seed.controller;

import com.seed.model.Employee;
import com.seed.service.EmpService;
import com.seed.service.EmpServiceImpl;

public class MyController {
	
	private EmpService empService = new EmpServiceImpl();
	
	public void addEmp(Employee emp) {
	      Employee addedEmp = empService.addEmployee(emp);
	      System.out.println("Employee added successfully, detail=> "+addedEmp);
	}
	
	public void printAllEmploee() {
		System.out.println("\n--------Employee details------------");
		for(Employee e:empService.getAllEmployeeDetails()) {
			System.out.println(e);
		}
	}

}

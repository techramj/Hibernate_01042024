package com.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seed.model.Employee;
import com.seed.service.EmpService;
import com.seed.service.EmpServiceImpl;

@Component
public class MyController {
	
	@Autowired
	private EmpService empService;
	
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

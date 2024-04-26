package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.controller.MyController;
import com.seed.model.Employee;

public class Test1 {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Employee e1= context.getBean("emp", Employee.class);
		//System.out.println(e1);
		Employee emp = new Employee(1, "Jack", 1000);
		MyController controller = new MyController();
		controller.addEmp(emp);
		controller.addEmp(new Employee(2, "Jackie", 2000));
		
		//display details
		controller.printAllEmploee();
	}

}

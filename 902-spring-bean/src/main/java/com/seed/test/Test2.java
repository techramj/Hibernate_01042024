package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Employee;

public class Test2 {
	
	public static void springExpUsingXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Employee emp1 = context.getBean("emp", Employee.class);
		Employee emp2 = context.getBean("emp", Employee.class);
		Employee emp3 = context.getBean("emp", Employee.class);
		Employee emp4 = context.getBean("emp", Employee.class);
		Employee emp5 = context.getBean("emp", Employee.class);
		System.out.println("Emp1: "+emp1);
		System.out.println("Emp2: "+emp2);
		
		System.out.println("comparing both object  using == "+(emp1==emp2));
		
		System.out.println("After setting slary to emp1");
		emp1.setSalary(9999);
		System.out.println("Emp1: "+emp1);
		System.out.println("Emp2: "+emp2);
		
		System.out.println("end....");
	}
	
	public static void main(String[] args) {
		springExpUsingXml();
	}

}

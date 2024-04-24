package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Bike;
import com.seed.model.Employee;

public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp1);
		
		Bike bike = context.getBean("bike1", Bike.class);
		//System.out.println(bike);
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(bike));
		System.out.println(emp1.equals(emp1));
		
		
		
	}

}

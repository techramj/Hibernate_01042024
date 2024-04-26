package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.model.Employee;

public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee e1= context.getBean("emp", Employee.class);
		System.out.println(e1);
	}

}

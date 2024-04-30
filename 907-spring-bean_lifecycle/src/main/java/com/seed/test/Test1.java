package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Employee;

public class Test1 {

	public static void springExpUsingXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("\n\nBean ready to used...");

		Employee emp1 = context.getBean("emp1", Employee.class);

		System.out.println(emp1);
		
		System.out.println("\n");
		
		//((AbstractApplicationContext)context).close();
		((AbstractApplicationContext)context).registerShutdownHook();
		

	}

	public static void main(String[] args) {
		springExpUsingXml();
	}

}

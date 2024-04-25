package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Car;
import com.seed.model.Engine;

public class Test3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		
		Car car1 = context.getBean("car", Car.class);
		System.out.println(car1);
		
	}

}

package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Car;

public class Test3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		
		Car car1 = context.getBean("car", Car.class);
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println("comparing car: "+(car1 == car2));
		System.out.println("comparing car engine: "+(car1.getEngine()== car2.getEngine()));
	}

}

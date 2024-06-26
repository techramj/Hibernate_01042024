package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Car;
import com.seed.model.Engine;

public class Test3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		
		Car car1 = context.getBean("car", Car.class);
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println("comparing car: "+(car1 == car2));
		System.out.println("comparing car engine: "+(car1.getEngine()== car2.getEngine()));
		
		Engine e1 = context.getBean("engine1", Engine.class);
		Engine e2 = context.getBean("engine1", Engine.class);
		System.out.println(e1==e2);
	}

}

package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Car;
import com.seed.model.Engine;
import com.seed.model.Seminar;

public class Test3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		
		Seminar s = context.getBean("seminar", Seminar.class);
		System.out.println(s.getStudent().getClass().getSimpleName());
		
	}

}

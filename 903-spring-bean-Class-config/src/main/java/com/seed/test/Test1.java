package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.Config;
import com.seed.model.Car;
import com.seed.model.Employee;

public class Test1 {

	public static Employee getEmp1Object() {
		Employee emp1 = new Employee(); // default
		emp1.setId(1);
		emp1.setName("jack");
		emp1.setSalary(5000);
		return emp1;
	}

	public static void springExpUsingXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	}

	public static void springExpUsingClassConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee e1 = context.getBean("emp", Employee.class);
		Employee e2 = context.getBean("emp", Employee.class);
		System.out.println(e1 == e2);
		
		Car c1 = context.getBean("car", Car.class);
		Car c2 = context.getBean("car", Car.class);
		
		System.out.println(c1==c2);
		System.out.println(c1.getEngine()==c2.getEngine());
		
	}

	public static void main(String[] args) {
		springExpUsingClassConfig();
	}

}

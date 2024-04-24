package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.model.Employee;

public class Test1 {
	
	public static Employee getEmp1Object() {
		Employee emp1 = new Employee(); //default
		emp1.setId(1);
		emp1.setName("jack");
		emp1.setSalary(5000);
		return emp1;
	}
	
	public static void coreJavaExmp() {
		Employee emp1 = getEmp1Object();
		
		Employee emp4 = new Employee(4, "Jessica", 50000);
		
		Employee emp2 = new Employee("John",1000);
		emp2.setId(2);
		
		Employee emp3 = new Employee(3,"Sam");
		emp3.setSalary(8000);
		
		Employee emp11 = getEmp1Object();
		
		System.out.println(emp1);
		System.out.println(emp11);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
	}
	
	public static void springExpUsingXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class);
		Employee emp3 = context.getBean("emp3", Employee.class);
		Employee emp4 = context.getBean("emp4", Employee.class);
		Employee emp11 = context.getBean("emp1", Employee.class);
		Employee emp12 = context.getBean("emp1", Employee.class);
		
		System.out.println(emp1);
		System.out.println(emp11);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
	}
	
	public static void main(String[] args) {
		coreJavaExmp();
		System.out.println("------------------------------------------\n");
		springExpUsingXml();
	}

}

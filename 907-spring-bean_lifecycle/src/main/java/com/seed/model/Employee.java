package com.seed.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean{

	private int id;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("default constructor of " + this.getClass().getSimpleName());
	}

	public Employee(int id, String name, double salary) {
		System.out.println("Paremertized with 3 parameter constructor of " + this.getClass().getSimpleName());
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, double salary) {
		System.out.println(
				"Paremertized with 2 parameter(String, String) constructor of " + this.getClass().getSimpleName());
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name) {
		System.out
				.println("Paremertized with (int,String) parameter constructor of " + this.getClass().getSimpleName());
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("EMployee.setId called");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emploee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware.setBeanName: "+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware.setApplicationContext(ApplicationContext) called");
	}
	
	public void empInit() {
		System.out.println("custom init called....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("InitializingBean.afterPropertiesSet method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy() called");
		
	}
	
	public void empDestroy() {
		System.out.println("custom destroy");
	}

}

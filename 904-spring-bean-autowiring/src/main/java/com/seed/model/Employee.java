package com.seed.model;

public class Employee {

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

}

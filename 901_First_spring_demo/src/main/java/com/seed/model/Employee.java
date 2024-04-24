package com.seed.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Vehicle vehicle;

	public Employee() {
		System.out.println("emp default constructor");
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return emp.id == this.id && emp.name.equals(this.name) && Double.compare(emp.salary, this.salary) == 0;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", vehicle=" + vehicle + "]";
	}

}

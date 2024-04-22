package com.seed.model;

public class Bike extends Vehicle {

	private String name;
	private String color;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + "]";
	}

}

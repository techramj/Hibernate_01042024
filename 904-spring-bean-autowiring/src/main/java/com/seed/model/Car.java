package com.seed.model;

public class Car {
	private String name;
	private String color;
	private Engine engine;

	public Car() {
		System.out.println("default constructor of "+this.getClass().getSimpleName());
	}
	
	public Car(Engine engine) {
		this.engine = engine;
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", engine=" + engine + "]";
	}

}

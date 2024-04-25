package com.seed.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	private String color;

	@Autowired
	private Engine engine;

	@Autowired
	@Qualifier(value = "wheel1")
	private Wheel wheel;

	public Car() {
		System.out.println("default constructor of " + this.getClass().getSimpleName());
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

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", engine=" + engine + ", wheel=" + wheel + "]";
	}

}

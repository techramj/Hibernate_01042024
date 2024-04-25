package com.seed.model;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String type;
	private String fuelType;

	public Engine() {
		System.out.println("default constructor of "+this.getClass().getSimpleName());
	}

	public Engine(String type, String fuelType) {
		super();
		this.type = type;
		this.fuelType = fuelType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", fuelType=" + fuelType + "]";
	}

}

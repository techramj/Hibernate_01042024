package com.seed.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("wage_emp")
public class WageEmployee extends Employee {
	private double hours;
	private double rate;

	public WageEmployee() {
		// TODO Auto-generated constructor stub
	}

	public WageEmployee(Integer id, String name, Double salary, double hours, double rate) {
		super(id, name, salary);
		this.rate = rate;
		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}

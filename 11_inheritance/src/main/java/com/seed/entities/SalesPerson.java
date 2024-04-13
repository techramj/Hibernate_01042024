package com.seed.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("sales_person")
public class SalesPerson extends Employee {

	private double salesMade;
	private double comm;

	public SalesPerson() {
	}

	public SalesPerson(Integer id, String name, Double salary, double salesMade, double comm) {
		super(id, name, salary);
		this.salesMade = salesMade;
		this.comm = comm;
	}

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

}

package com.seed.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sales_person_13")
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

package com.seed.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_apr")
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "fname", length = 20 )
	private String name;
	
	@Column(columnDefinition = "number(8,2)")
	private Double salary;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}

package com.seed.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "get_all_emp", query = "select e from Employee e"),
		@NamedQuery(name = "find_all_with_salary_greater_than", query = "select e from Employee e where e.netSalary>:sal"),
		@NamedQuery(name = "find_all_with_salary_equals", query = "select e from Employee e where e.netSalary = :sal"), })

@Entity
@Table(name = "emp_14")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq", sequenceName = "seq_emp_14", allocationSize = 1, initialValue = 500)
	private Integer id;
	private String name;
	
	@Column(name="salary")
	private Double netSalary;

	public Employee() {
	}

	public Employee(Integer id, String name, Double netSalary) {
		super();
		this.id = id;
		this.name = name;
		this.netSalary = netSalary;
	}

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

	public Double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}

}

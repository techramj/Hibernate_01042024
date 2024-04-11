package com.seed.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "dept_09")
public class Department {

	@Id
	@Column(name = "did")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_id_gen")
	@SequenceGenerator(name = "dept_id_gen", sequenceName = "seq_dept_09_id", allocationSize = 10, initialValue = 10)
	private Integer id;

	@Column(name = "dept_nmae", length = 20)
	private String name;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}

package com.seed.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "project_10")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_id_gen")
	@SequenceGenerator(name = "project_id_gen", initialValue = 1000, allocationSize = 1)
	private Integer projectId;

	@Column(name = "project_name")
	private String name;

	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees = new ArrayList<>();

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name) {
		super();
		this.name = name;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

}

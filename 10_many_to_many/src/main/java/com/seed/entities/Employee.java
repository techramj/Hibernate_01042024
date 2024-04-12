package com.seed.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp_10")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_gen")
	@SequenceGenerator(name = "emp_id_gen", initialValue = 100, allocationSize = 1)
	private Integer id;
	private String name;
	private Double salary;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_project", 
			   joinColumns = {@JoinColumn(name="eid")}, 
			   inverseJoinColumns = {@JoinColumn(name="pid")}
	)
	private List<Project> projects = new ArrayList<>();
	
	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void addProject(Project project) {
		projects.add(project);
	}
}

package com.seed.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp_04")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_emp_04")
	@SequenceGenerator(name ="seq_emp_04", initialValue = 1000, allocationSize = 1 )
	private Integer id;
	private String name;
	private Double salary;
	
	@ElementCollection
	//@JoinTable(name="projects_04")
	@Column(name="project")
	private List<String> projects;
	
	@ElementCollection
	@JoinTable(name="skills_04")
	private Set<String> skills;
	
	@ElementCollection
	@JoinTable(name="emp_parent_adderss_04")
	private List<Address> parentAddress;
	
	public Employee() {
		
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

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	
	
	public void setParentAddress(List<Address> parentAddress) {
		this.parentAddress = parentAddress;
	}
	
	public List<Address> getParentAddress() {
		return parentAddress;
	}
	

}

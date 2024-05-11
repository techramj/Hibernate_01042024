package com.seed.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EmployeeDto {
	private int id;
	
	@JsonProperty(value = "firstName")
	private String name;
	private double salary;
	
	//@JsonIgnore
	private Date created = new Date();

}

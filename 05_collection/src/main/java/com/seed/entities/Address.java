package com.seed.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String pincode;
	private String relation;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String pincode, String relation) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.relation = relation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getRelation() {
		return relation;
	}

}

package com.seed.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "passport_08")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_id_gen")
	@SequenceGenerator(name = "passport_id_gen", sequenceName = "seq_passport_08_id", allocationSize = 1, initialValue = 111)
	@Column(name = "passport_id")
	private int passportId;

	@Column(name = "passport_number", length = 13, nullable = false)
	private String passportNumber;

	@Column(name = "expiry_date")
	private Date expiryDate;
	
	@OneToOne(mappedBy = "passport")
	private Employee employee;

	public Passport() {
	
	}

	public Passport(String passportNumber, Date expiryDate) {
		this.passportNumber = passportNumber;
		this.expiryDate = expiryDate;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", expiryDate="
				+ expiryDate + "]";
	}

}

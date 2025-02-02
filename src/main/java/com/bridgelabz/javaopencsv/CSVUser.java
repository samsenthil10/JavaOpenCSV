package com.bridgelabz.javaopencsv;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
	
	@CsvBindByName
	private String name;

	@CsvBindByName(column = "email", required = true)
	private String email;

	@CsvBindByName(column = "phone")
	private String phoneNo;

	@CsvBindByName
	private String country;

	@Override
	public String toString() {
		return name + " | " + email + " | " + phoneNo + " | " + country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
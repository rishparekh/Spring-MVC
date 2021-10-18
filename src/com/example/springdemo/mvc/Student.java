package com.example.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countries;
	
	public Student() {
		countries = new LinkedHashMap<String, String>();
		
		countries.put("IN", "INDIA");
		countries.put("SP", "SPAIN");
		countries.put("DE", "Germany");
		countries.put("FR", "FRANCE");
		countries.put("BR", "BRAZIL");
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	
	
}

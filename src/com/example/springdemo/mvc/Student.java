package com.example.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String nativeCountry;
	private String favoriteLanguage;
	private String secondarySkill;
	
	private LinkedHashMap<String, String> countries;
	private LinkedHashMap<String, String> secondarySkills;
	
	private String[] operatingSystems;
	
	public Student() {
		countries = new LinkedHashMap<String, String>();
		
		countries.put("IN", "INDIA");
		countries.put("SP", "SPAIN");
		countries.put("DE", "Germany");
		countries.put("FR", "FRANCE");
		countries.put("BR", "BRAZIL");
		
		secondarySkills = new LinkedHashMap<String, String>();
		secondarySkills.put("AngularJS", "AngularJS");
		secondarySkills.put("ReactJS", "ReactJS");
		secondarySkills.put("AWS", "AWS");
		secondarySkills.put("NodeJS", "NodeJS");
		
		
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
	
	

	public String getNativeCountry() {
		return nativeCountry;
	}

	public void setNativeCountry(String nativeCountry) {
		this.nativeCountry = nativeCountry;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public LinkedHashMap<String, String> getSecondarySkills() {
		return secondarySkills;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	
}

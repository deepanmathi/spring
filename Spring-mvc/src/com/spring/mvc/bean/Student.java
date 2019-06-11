package com.spring.mvc.bean;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String programLanguage;
	private List<String> operatingSystems;
	
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public Student()
	{
		countryOptions=new LinkedHashMap<String, String>();
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("IND", "India");
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
	
	//only get not set because value is set in constructor
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public String getProgramLanguage() {
		return programLanguage;
	}
	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}
	
	
	
	
}

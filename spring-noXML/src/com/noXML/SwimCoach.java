package com.noXML;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	private FortuneService fortuneServ;
	
	@Value("${prop.name}")
	private String name;
	
	@Value("${prop.email}")
	private String email;
	
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

	
	
	public SwimCoach(FortuneService fortuneServ)
	{
		this.fortuneServ=fortuneServ;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swimming";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServ.getFortune();
	}

}

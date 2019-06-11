package com.noXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{

	/*@Autowired
	@Qualifier("sadFortune")*/
	private FortuneService fortuneServ;
	
	@Value("${prop.email}")
	private String email;
	
	@Value("${prop.name}")
	private String name;
	    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortune")FortuneService fServ)
	{
		fortuneServ=fServ;
	}
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "pratice smash";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneServ.getFortune();
	}
	public FortuneService getFortuneServ() {
		return fortuneServ;
	}
	
	//@Autowired
	public void setFortuneServ(FortuneService fortuneServ) {
		System.out.println("in");
		
	}
	/*@Autowired
	public void blah(FortuneService fortuneServ) {
		System.out.println("blah");
		this.fortuneServ = fortuneServ;
	}
*/
	@PostConstruct
	public void init()
	{
		System.out.println("init");
	}
	@PreDestroy
	public void dest()
	{
		System.out.println("dest");
	}
}

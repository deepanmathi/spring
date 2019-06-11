package com.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class clientNew {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(sportsConfig.class);
		SwimCoach swim=context.getBean("swimCo",SwimCoach.class);
		System.out.println(swim.getDailyWorkout());
		System.out.println(swim.getDailyFortune());
		System.out.println(swim.getName());
		System.out.println(swim.getEmail());
	}

}

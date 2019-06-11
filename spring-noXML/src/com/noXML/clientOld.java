package com.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clientOld {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(sportsConfig.class);
		TennisCoach mycoach=context.getBean("tennisCoach",TennisCoach.class);
		TennisCoach mycoach1=context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(mycoach);
		System.out.println(mycoach1);
		System.out.println(mycoach.getDailyWorkout());
		System.out.println(mycoach.getDailyFortune());
		System.out.println(mycoach.getEmail());
		System.out.println(mycoach.getName());
		context.close();//for prototype destroy wont work
	}

}

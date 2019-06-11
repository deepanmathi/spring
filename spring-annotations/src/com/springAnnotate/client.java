package com.springAnnotate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
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

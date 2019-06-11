package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runClass {
	
	public static void main(String[] args) {
		//spring container is classpathxml
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//interface is for app configurable
		coach basecoach= context.getBean("myCoachBase",coach.class);
		System.out.println(basecoach.getDailyWorkout());
		System.out.println(basecoach.getDailyFortune());
		System.out.println("-----------------------");
		coach trackcoach= context.getBean("myCoachTrack",coach.class);
		System.out.println(trackcoach.getDailyWorkout());
		System.out.println(trackcoach.getDailyFortune());
		System.out.println("-----------------------");
		CricketCoach criccoach= (CricketCoach) context.getBean("myCoachCricket",coach.class);
		System.out.println(criccoach.getName());
		System.out.println(criccoach.getEmail());
		System.out.println(criccoach.getDailyWorkout());
		System.out.println(criccoach.getDailyFortune());
		
		
		context.close();
		
	}

}

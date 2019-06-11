package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runClassScopes {
	public static void main(String[] args) {
	   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("scopes-beans.xml");
	   coach myA=context.getBean("myCoachBase",coach.class);
	   coach myB=context.getBean("myCoachBase",coach.class);
	   System.out.println(myA==myB);
	   System.out.println(myA);
	   System.out.println(myB);
	   context.close();
	   
	}

}

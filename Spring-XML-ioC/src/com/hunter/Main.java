package com.hunter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the IoC container configuration
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:BeanConfig.xml");
		
		
//		@Autowired
		AthleticsCoach a;
		// Get a reference to the bean (using it's id)
		Coach coach=(Coach) context.getBean("myCoach");
		Coach coach1=(Coach) context.getBean("criccoach");
		Coach coach2=(Coach) context.getBean("criccoach");
		//Use the bean
		System.out.println(coach.giveMyWorkout());
		System.out.println(coach.howsTheWeather());
		System.out.println(coach.tellMyFortune());
		System.out.println(coach.getGamesPlayed());
		System.out.println(coach.giveMyName());
		System.out.println(coach1);
		System.out.println(coach2);
//		System.out.println(coach.getFirstName());
//		System.out.println(coach.getSecondName());
		((AbstractApplicationContext) context).close();
	}

}

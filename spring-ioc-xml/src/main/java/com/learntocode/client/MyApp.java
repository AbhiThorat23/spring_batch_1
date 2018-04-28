package com.learntocode.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.service.Coach;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		
		myCoach.getDailyWorkout();
		
		context.close();
	}

}

package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		// Retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check to see if they are the same beans
		System.out.println("Pointing to the same object: " + (theCoach == alphaCoach));
		
		// Print memory locations
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		// Use the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}
}

package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		
		// Retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Use the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}

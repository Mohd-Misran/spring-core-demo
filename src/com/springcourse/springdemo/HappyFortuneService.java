package com.springcourse.springdemo;

// Define the dependency class
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}

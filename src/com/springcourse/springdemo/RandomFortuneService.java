package com.springcourse.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
		"Fortune message 1",
		"Fortune message 2",
		"Fortune message 3",
		"Fortune message 4",
		"Fortune message 5",
		"Fortune message 6",
	};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}

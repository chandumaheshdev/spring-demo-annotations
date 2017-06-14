package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	
	private FortuneService fortuneService; 
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService; 
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "have a great day";
	}

}

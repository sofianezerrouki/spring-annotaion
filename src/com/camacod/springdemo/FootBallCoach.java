package com.camacod.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "foot Ball daily , training 70 min by day LoL";
	}

}

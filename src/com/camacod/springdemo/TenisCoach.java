package com.camacod.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //like a bean in the xml configuration

@Component   
//default bean id is the name of class exept the firt letter is lower case 
public class TenisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Tenis Daily Work For 2 hour training ..";
		
	}

}

package com.camacod.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //like a bean in the xml configuration

@Component   
//default bean id is the name of class exept the firt letter is lower case 
public class TenisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TenisCoach() {
		System.out.println(">>Tenis Coach : inside the constructor ");
	}
	
	//define a setter methods 
	@Autowired
	public void doSumCrazyStuff(FortuneService fortuneService) {
		System.out.println(">>Tenis Coach : inside doSumCrazyStuff() method");		
		this.fortuneService = fortuneService;
	}
	
	/*
	//@Autowired
	public TenisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		
		return "Tenis Daily Work For 2 hour training ..";
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	
}

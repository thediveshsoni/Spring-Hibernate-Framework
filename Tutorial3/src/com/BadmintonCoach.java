package com;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	public BadmintonCoach(){}
	public void setFortuneService(FortuneService theFortune){
		fortuneService = theFortune;
	}
	public String getInfo(){
		return "Playing Badminton";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortuneService();
	}
}

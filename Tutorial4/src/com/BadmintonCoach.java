package com;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	public BadmintonCoach(){}
	public void setFortuneService(FortuneService theFortune){
		fortuneService = theFortune;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInfo(){
		return "Playing Badminton";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortuneService();
	}
}

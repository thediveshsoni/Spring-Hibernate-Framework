package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BadmintonCoach theCoach = context.getBean("myCoach", BadmintonCoach.class);
		System.out.println(theCoach.getInfo());
		System.out.println(theCoach.getFortune());
		System.out.println("Email ID : " +theCoach.getEmail());
		context.close();

	}

}

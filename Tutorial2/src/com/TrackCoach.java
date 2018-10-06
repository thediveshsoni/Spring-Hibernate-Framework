package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getInfo());
		System.out.println(theCoach.getFortune());
		context.close();

	}

}

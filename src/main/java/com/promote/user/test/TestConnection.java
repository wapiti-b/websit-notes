package com.promote.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestConnection {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
		//UserMapper mapper = context.getBean(UserMapper.class);
		
		//mapper.findUser();
	}
}

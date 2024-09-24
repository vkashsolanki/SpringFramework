package com.staticmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/staticmethod/config.xml");
		Demo bean = context.getBean("demo",Demo.class);
		System.out.println(bean);
		
		
		
	}

}

package com.collectionvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/collectionvalue/config.xml");
		Student bean = (Student) applicationContext.getBean("student",Student.class);
		System.out.println(bean);
		System.out.println(bean.getStudentname());
		
		
		
	}

}

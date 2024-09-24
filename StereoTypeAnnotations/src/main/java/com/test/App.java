package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/config.xml");
		Student bean = (Student) applicationContext.getBean("ob");
		
		
		
//		bean.setId(100);
//		bean.setName("Ram");
//		bean.setAddress("Delhi");
		
		
		System.out.println(bean);
		
		
		
//		System.out.println(bean.getId());
//		System.out.println(bean.getName());
//		System.out.println(bean.getAddress());

	}
}

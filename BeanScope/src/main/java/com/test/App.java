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
		System.out.println(bean.hashCode());
		
		Student bean1 = (Student) applicationContext.getBean("ob");		
		System.out.println(bean1.hashCode());
		Student bean2 = (Student) applicationContext.getBean("ob");		
		System.out.println(bean2.hashCode());
		Student bean3 = (Student) applicationContext.getBean("ob");		
		System.out.println(bean3.hashCode());
		Student bean4 = (Student) applicationContext.getBean("ob");		
		System.out.println(bean4.hashCode());
		Student bean5 = (Student) applicationContext.getBean("ob");		
		System.out.println(bean5.hashCode());
		Student bean6 = (Student) applicationContext.getBean("ob");		
		System.out.println(bean6.hashCode());


	}
}

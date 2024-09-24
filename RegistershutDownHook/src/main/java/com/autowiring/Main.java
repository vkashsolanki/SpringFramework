package com.autowiring;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/config.xml");
	
	Employee bean = (Employee) context.getBean("employee");
	System.out.println(bean);

	}
}

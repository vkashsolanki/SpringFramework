package com.annotaions;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/annotaions/config.xml");
	
	Employee bean = (Employee) context.getBean("employee",Employee.class);
	System.out.println(bean);

	}
}

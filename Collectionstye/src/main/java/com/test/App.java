package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
    	Student bean = (Student) applicationContext.getBean("student");
    	System.out.print(bean.getName());
    	System.out.println(bean.getPhones().getClass().getName());
    	System.out.println(bean.getAddress());
    	System.out.println(bean.getCourses());
    	
    	
    	
    	
    }
}

package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
    	
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
     Employee bean = (Employee) applicationContext.getBean("employee");
    // System.out.println(" "+ bean.getId()+" " +bean.getName() +" "+ bean.getAddress());

     
     System.out.println(bean);
    }  
}

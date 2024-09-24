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
      
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	TestRefenceInject bean = (TestRefenceInject) context.getBean("tri");
    	 Employee bean1 = (Employee) context.getBean("employee");
       	System.out.println(bean1.getName());
    	System.out.println(bean.getEmp());
    	System.out.println(bean.getNumber());
    	System.out.println(bean);
    	System.out.println(bean1);
    	
    }
}

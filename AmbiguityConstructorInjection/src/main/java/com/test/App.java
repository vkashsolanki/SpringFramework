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
        System.out.println( "Hello World!" );  
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //Person bean = (Person)context.getBean("person");
        //System.out.println(bean);
        
        
     //   Vikash bean1 = (Vikash)context.getBean("vk");
       // System.out.println(bean1);
        
        
        AmbguityProblem bean = (AmbguityProblem)context.getBean("amb");
        
        bean.sumbhai();
        
        
        
        
        
       
        
    }
}

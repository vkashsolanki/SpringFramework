package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Samosa bean = (Samosa)context.getBean("samosa");
        System.out.println(bean);
        context.registerShutdownHook();
         
    }
}

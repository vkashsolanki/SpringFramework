package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Vehicle bean=(Vehicle)context.getBean("vehicle");
        System.out.println(bean);
        bean.viewVehicle();
        
        
    }
}

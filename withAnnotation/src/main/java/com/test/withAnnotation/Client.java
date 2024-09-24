package com.test.withAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
      //  Employee bean = (Employee)context.getBean("getEmployee");
        Employee bean = (Employee)context.getBean("test"); 
        
        System.out.println(bean);
        
        bean.study();	
    }
}

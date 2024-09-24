package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Bird bean =(Bird) context.getBean("bird");
        System.out.println(bean);
        bean.getfly();
        

    }
}

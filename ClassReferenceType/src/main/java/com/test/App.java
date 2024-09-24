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
       Student bean = (Student) context.getBean("student");
       System.out.println(bean);
       
       
       Address bean1 = (Address) context.getBean("add");
       System.out.println(bean1);
       
       
    }
}

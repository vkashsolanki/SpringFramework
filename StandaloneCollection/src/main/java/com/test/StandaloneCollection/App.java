package com.test.StandaloneCollection;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/Standalonecollection/config.xml"); 
        Person bean = applicationContext.getBean("person", Person.class);
       // System.out.println(bean.getFees());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println(bean.getProperties());
       // System.out.println(bean.getFriends().getClass().getName());
    }
}

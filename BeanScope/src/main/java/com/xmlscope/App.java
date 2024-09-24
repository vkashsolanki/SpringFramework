package com.xmlscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/xmlscope/config.xml");
	Student bean = (Student) context.getBean("student",Student.class);
	System.out.println(bean);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(bean.hashCode());

	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	Teacher bean2 = (Teacher) context.getBean("teacher",Teacher.class);
	System.out.println(bean2.hashCode());
	
	Teacher bean3 = (Teacher) context.getBean("teacher",Teacher.class);
	System.out.println(bean3.hashCode());
}

}

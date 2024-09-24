package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/test/config.xml");
		context.registerShutdownHook();
		Sprite bean = (Sprite) context.getBean("sprite");
		System.out.println(bean);

//        Jalebi bean = (Jalebi)context.getBean("jalebi");
//        System.out.println(bean);      
//        // enable registering shutdownhook which has registershutdownhook() in AbstractApplicationContext
//        context.registerShutdownHook();

//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        
//        Pepsi bean2 =(Pepsi) context.getBean("pepsi");
//        System.out.println(bean2);
//        context.registerShutdownHook();

	}
}

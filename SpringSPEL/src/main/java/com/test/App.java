package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	
public static void main(String[] args) {
	
	
	
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/config.xml");
			// when using class name in getBean() method pass class name then you dont need create  typecasting ohterwise need typecasting	
			Test bean = applicationContext.getBean("test", Test.class);	
			System.out.println(bean);
	
			
			
			
			
			SpelExpressionParser expressionParser = new SpelExpressionParser();
			Expression parseExpression = expressionParser.parseExpression("5000+5000");
			
			System.out.println(parseExpression.getValue());

}
}

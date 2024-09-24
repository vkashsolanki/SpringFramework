package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.test")
public class JavaConfig {
	
	
	@Bean
	public Parrot getParrot()
	{
		
		return new Parrot();
		
	}
	
	@Bean(name = "bird")
	public Bird getBird()
	{
		Bird bird = new Bird(getParrot());
		
		return bird;
	}
	
	

}

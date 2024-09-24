package com.test.withAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.test")
public class JavaConfig {
	
	@Bean
	public Student getStudent()
	{
		return new Student();

		
	}
	
	
	// crate object class type ka jo object return karega and o object ioc jisse chahega usse dega @Bean lga ke
	@Bean(name = {"emp","test"})
	public Employee getEmployee()
	{
		// hame mannually object create krna hoga
		Employee employee = new Employee(new Student());
		
		return employee;
	}

}

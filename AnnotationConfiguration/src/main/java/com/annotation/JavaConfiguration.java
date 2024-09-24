package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	
	
	@Bean
	public Bike getBike()
	{
		return new Bike();
	}
	
	
	
	@Bean("vehicle")
	public Vehicle getVehicle()
	{
	Vehicle vehicle = new Vehicle(getBike());
	
	 return vehicle;
		
	}
	

}

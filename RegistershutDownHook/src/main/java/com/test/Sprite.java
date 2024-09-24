package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sprite {

	private String brandname;



	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public Sprite() {
		super();
		
	}

	@Override
	public String toString() {
		return "Sprite [brandname=" + brandname + "]";
	}
	
	
	@PostConstruct
	public void startinit()
	{
		System.out.println("start inti method");
		
	}
	@PreDestroy
	public void destroy()
	{
		
		System.out.println("end method");
	}
}

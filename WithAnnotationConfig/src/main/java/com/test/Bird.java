package com.test;

import org.springframework.stereotype.Component;

//@Component
public class Bird {

	
	private Parrot parrot;



	public Bird(Parrot parrot) {
		super();
		this.parrot = parrot;
	}

	public Parrot getParrot() {
		return parrot;
	}
	
	
	

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
	
	public void getfly() {
		
		this.parrot.parrotkids();
		System.out.println("The birds are trying to fly");
	}

}

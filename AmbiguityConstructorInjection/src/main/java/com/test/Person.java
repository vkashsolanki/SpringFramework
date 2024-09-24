package com.test;

public class Person {
	
	
	private int id;
	private String name;
	private Vikash solanki;
	
	// by constructor injection
	public Person(int id, String name, Vikash solanki) {
		
		this.id = id;
		this.name = name; 
		this.solanki = solanki;
		
	}


	@Override
	public String toString() {
	
		return this.id+" "+ this.name+" "+this.solanki;
	}
	
	
	
	

}

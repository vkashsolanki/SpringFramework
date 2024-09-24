package com.test;

public class AmbguityProblem {
	
	
	private int a;
	private int b;


	public AmbguityProblem(double a, double b)
	{
		
	this.a = (int)a;
	this.b = (int)b;
	System.out.println("this constructor for Double value get");	
	}	
	
	public AmbguityProblem(int a, int b)
	{
	
	this.a = a;
	this.b = b;
	System.out.println("this constructor for Integer value get");
	
		
	}
	
	
	public AmbguityProblem(String a, String b) {
		//for convert in integer value use parseInt()
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b); 
		System.out.println("this constructor for String value get");	
		
		
	}
	

	
	
	public void sumbhai()
	{
		System.out.println(this.a+this.b);
		
	}

}

package com.test;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("properties setting");
		this.price = price;
	}
	
	
	public void init()
	{
	System.out.println("init inside");	
		
	}
	
	
	public void destroy()
	{
		System.out.println("destroy inside");
		
	}
	

	public Samosa() {
		super();
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	

}

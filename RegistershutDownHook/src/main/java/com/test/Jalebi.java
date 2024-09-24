package com.test;

public class Jalebi {
	
	
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		System.out.println("set jalebi weight");
		this.weight = weight;
	}

	public Jalebi() {
		super();
	}

	@Override
	public String toString() {
		return "Jalebi [weight=" + weight + "]";
	}
	
	
	public void init()
	{
		System.out.println("this init method initialize properties");
	}
	

	
	public void destroy()
	{
		System.out.println("this destory method destroy object");
	}
	
	
	

}

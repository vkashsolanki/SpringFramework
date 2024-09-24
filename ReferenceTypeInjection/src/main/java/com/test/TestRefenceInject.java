package com.test;

public class TestRefenceInject {
	
	
	
	private int number;
	private Employee emp;
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public TestRefenceInject(int number, Employee emp) {
		super();
		this.number = number;
		this.emp = emp;
	}
	public TestRefenceInject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TestRefenceInject [number=" + number + ", emp=" + emp + "]";
	}
	
	
	
	
	

}

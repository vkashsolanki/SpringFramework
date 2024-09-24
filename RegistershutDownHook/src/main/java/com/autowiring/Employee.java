package com.autowiring;

public class Employee {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(Address add) {
		super();
		this.address = add;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}

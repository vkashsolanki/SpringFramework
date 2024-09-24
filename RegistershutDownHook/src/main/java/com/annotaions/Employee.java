package com.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	// 1. @Autowired
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	// 2. @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//@Autowired
	public Employee(Address add) {
		super();
		this.address = add;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}

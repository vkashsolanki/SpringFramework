package com.test.withAnnotation;

import org.springframework.stereotype.Component;

//@Component("employee")
public class Employee {
	
	
	// dependency lete ha
	private Student student;
	

	
	
	public Employee(Student student) {
		super();
		this.student = student;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public void study()
	{
		this.student.show();
		System.out.println("Employee has good knowldge");
	}
	
	
	

}

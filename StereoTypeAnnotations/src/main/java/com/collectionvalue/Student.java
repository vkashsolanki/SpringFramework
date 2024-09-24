package com.collectionvalue;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("500")
	private int id;
	@Value("Vikash Solanki")
	private String name;
	@Value("New Delhi")
	private String address;
	@Value(value = "#{st}")
	private List<String> studentname;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, List<String> studentname) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.studentname = studentname;
	}
	public List<String> getStudentname() {
		return studentname;
	}
	public void setStudentname(List<String> studentname) {
		this.studentname = studentname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", studentname=" + studentname + "]";
	}

	
	
	

}

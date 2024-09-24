package com.staticmethod;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double e;
	
	
	@Value("#{ new java.lang.String('vikash')}")
	private String name;
	 
	@Value("#{ 15>10 }")
	private boolean inActive;
	
	
	public boolean isInActive() {
		return inActive;
	}

	public void setInActive(boolean inActive) {
		this.inActive = inActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Demo [z=" + z + ", e=" + e + ", name=" + name + ", inActive=" + inActive + "]";
	}
	

}

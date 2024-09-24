package com.annotation;

public class Vehicle {

	private Bike bike;

	public void viewVehicle() {
		this.bike.infoBike();
		this.bike.raceShow();
		System.out.println("Only Permission on Two wheeler");
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Bike bike) {
		super();
		this.bike = bike;
	}

}

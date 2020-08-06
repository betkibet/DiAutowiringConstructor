package com.clc;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private String carName;
	@Autowired
	private Engine engine;
	private Speed vSpeed;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Car(Engine e, Speed v) {
		//syso ctrl + tab
		//main ctrl + tab
		//set ctrl + tab
		System.out.println("I am inside a constructor");
		this.vSpeed = v;
		this.engine = e;
		
	}
	
	//Generate getters for engine, although a constructor already exists.
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("I am inside setter method for engine");
		this.engine = engine;
	}

	//Method to print the car details
	public void printCarDetails() {
		System.out.println("Car Name: " + carName);
		System.out.println("Engine Model Year : " + engine.getModelYear());
		System.out.println("Vehicle Speed: " + vSpeed.getvSpeed());
	}
}

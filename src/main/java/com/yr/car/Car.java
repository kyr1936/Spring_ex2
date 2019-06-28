package com.yr.car;

public class Car {

	private Wheel wheel;
	
	public Car() {
		
	}
	
	
	public Car(Wheel wheel) {
		this.wheel  = wheel;
	}
	
	public void setWheel(Wheel wheel)	{
		this.wheel = wheel;
		
	}

	public Wheel getWheel() {
		return wheel;
	}
	
}

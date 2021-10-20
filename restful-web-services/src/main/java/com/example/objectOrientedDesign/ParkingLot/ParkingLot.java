package com.example.objectOrientedDesign.ParkingLot;

public abstract class ParkingLot {

	String Pincode;
	int numberOfLevel;
	int MaxCapacity;
	
	public ParkingLot(String pincode, int numberOfLevel, int maxCapacity) {
		super();
		Pincode = pincode;
		this.numberOfLevel = numberOfLevel;
		MaxCapacity = maxCapacity;
	}
	
	
	public abstract Slot ParkVehicle(Vehicle v);
	public  abstract Slot RemoveVechicle(Vehicle v);
	
}


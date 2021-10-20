package com.example.objectOrientedDesign.ParkingLot;

public abstract class Vehicle {

	
	String plateNumber;
	String color;
	String size;

	public Vehicle(String plateNumber, String color, String size) {
		super();
		this.plateNumber = plateNumber;
		this.color = color;
		this.size = size;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	
}

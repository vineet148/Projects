package com.example.objectOrientedDesign.ParkingLot;

public class Slot {

	
	int id;
	String pincode;
	String VechicleplatNumber;
	String size;
	
	public Slot(int id, String pincode, String vechicleplatNumber, String size) {
		super();
		this.id = id;
		this.pincode = pincode;
		VechicleplatNumber = vechicleplatNumber;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getVechicleplatNumber() {
		return VechicleplatNumber;
	}

	public void setVechicleplatNumber(String vechicleplatNumber) {
		VechicleplatNumber = vechicleplatNumber;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
	
}

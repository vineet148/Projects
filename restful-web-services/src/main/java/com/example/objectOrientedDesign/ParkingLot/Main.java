package com.example.objectOrientedDesign.ParkingLot;

public class Main {

	public static void main(String args[])
	{
		Vehicle car=new Car("123","Red","L");
		Vehicle truck=new Truck("234","White","XL");
		Vehicle bike=new Bike("345","Black","S");
		Slot s=null;
		ParkingLot explorer=new ExplorerParkingLot("804403", 2, 100,20,60,40);
		 s=explorer.ParkVehicle(car);
	    System.out.println("booked slot"+s.getId()+"size"+s.getSize());
   		s=explorer.ParkVehicle(truck);
	    System.out.println("booked slot"+s.getId()+"size"+s.getSize());
		s=explorer.ParkVehicle(bike);
	    System.out.println("booked slot"+s.getId()+"size"+s.getSize());
	    	
		
		
	}
	
}

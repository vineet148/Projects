package com.example.objectOrientedDesign.ParkingLot;

import java.util.Random;

public class ExplorerParkingLot extends ParkingLot {

	int slotLeft;
	int smallSLot;
	int largeSlot;
	int XLSlot;
	
	public ExplorerParkingLot(String pincode, int numberOfLevel, 
			int maxCapacity,int smallslot,int largeslot,int XLSlot) {
		super(pincode, numberOfLevel, maxCapacity);
		// TODO Auto-generated constructor stub
	
		this.smallSLot=smallslot;
		this.largeSlot=largeslot;
		this.XLSlot=XLSlot;
		this.slotLeft=maxCapacity;
	
	
	}

	@Override
	public Slot ParkVehicle(Vehicle v) {

		Random r=new Random();
		Slot slot=null;
		if(slotLeft <=0)
		{
			 System.out.println(new UserDefinedExcpetion().Error());
             return null;
		}
		
		if(v.getSize()=="XL")
		{
			if(this.XLSlot > 0)
			{
					slot=new Slot(r.nextInt(100),this.Pincode,v.plateNumber
							,v.getSize());
			    this.XLSlot-=1;
			    this.slotLeft-=1;
			}
		}else if(v.getSize()=="L")
		{
			if(this.largeSlot >0)
			{
				slot=new Slot(r.nextInt(100),this.Pincode,v.plateNumber
						,v.getSize());				
			this.largeSlot-=1;
			this.slotLeft-=1;
			}
		}else if(v.getSize()=="S")
		{
			if(this.smallSLot >0)
			{
				slot=new Slot(r.nextInt(100),this.Pincode,v.plateNumber
						,v.getSize());				
			this.smallSLot-=1;
			this.slotLeft-=1;
			}
		}else
		{
			System.out.println("Wrong Vehicle entered");
			return null;
		}
		
		return slot;
		
		// TODO Auto-generated method stub
	
		
		
	}

	@Override
	public Slot RemoveVechicle(Vehicle v) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public int slotRemaining()
	{
		return slotLeft;
	}

	
	
}

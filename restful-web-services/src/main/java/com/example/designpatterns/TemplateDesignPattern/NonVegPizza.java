package com.example.designpatterns.TemplateDesignPattern;

public class NonVegPizza extends Pizza {

	
	@Override
	void addVeggies() {
		// TODO Auto-generated method stub

		System.out.println("Veggies added");
		
	}

	@Override
	void addSausage() {
		// TODO Auto-generated method stub
		
		System.out.println("Sausage added");
	}

	@Override
	void addMeat() {
		// TODO Auto-generated method stub
		
		System.out.println("meat added");
	}

	
	//these are called hooks
	public boolean veggiesRequired() {
		return false;
	}

	public boolean meatRequired() {
		return true;
	}

}

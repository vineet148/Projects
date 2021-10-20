package com.example.designpatterns.TemplateDesignPattern;

public class VegPizza extends Pizza {

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

	public boolean veggiesRequired() {
		return true;
	}

	public boolean meatRequired() {
		return false;
	}

}

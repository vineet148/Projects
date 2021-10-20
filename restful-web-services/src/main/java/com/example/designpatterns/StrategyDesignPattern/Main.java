package com.example.designpatterns.StrategyDesignPattern;

public class Main {

	
	public static void main(String args[])
	{
		Animal doggy=new Dog();
		//doggy.setFlyingType(new ItFlys());
		Animal birdy=new Bird();
	
		System.out.println("earlier dog "+doggy.toFly());
		System.out.println("Earlier bird "+birdy.toFly());
	   
		Flys flyintype=new ItFlys();
		doggy.setFlyingType(flyintype);
		System.out.println("now "+doggy.toFly());
	
	}
}


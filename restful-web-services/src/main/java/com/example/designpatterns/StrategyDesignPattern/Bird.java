package com.example.designpatterns.StrategyDesignPattern;

public class Bird extends Animal {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	    setSound("Tweet");
	   
	    flyingType=new ItFlys();
	}

	
	
	
}

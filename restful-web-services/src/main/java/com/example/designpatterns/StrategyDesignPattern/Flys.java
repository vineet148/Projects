package com.example.designpatterns.StrategyDesignPattern;

public interface Flys {

	String fly();
	
}

class ItFlys implements Flys
{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Flying high";
	}
  	
}

class CantFly implements Flys
{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Cant Fly";
	}

	
	
}


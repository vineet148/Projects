package com.example.designpatterns.AdapterDesignPattern;

public class GameControl {

	public static void main(String args[])
	{
		
		Enemytank enemytank=new Enemytank(new EnemyAdapter(new Robotank()));
		enemytank.moveForward();
		enemytank.fire();
		
	}
	
}

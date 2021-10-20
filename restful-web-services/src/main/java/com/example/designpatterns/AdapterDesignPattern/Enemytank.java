package com.example.designpatterns.AdapterDesignPattern;

public class Enemytank {

	IEnemyAdapter enemyAdapter;

	public Enemytank(IEnemyAdapter enemyAdapter) {
		super();
		this.enemyAdapter = enemyAdapter;
	}
  
	public void moveForward()
	{
		enemyAdapter.moveForward();
	}
	
	public void fire()
	{
		enemyAdapter.fireWeapon();
	}
	
}

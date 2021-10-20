package com.example.designpatterns.FactoryDesignPattern;

public class EnemyShipFactory {

	 public EnemyShip CreateNewShip(String shipType)
	 {
		 
		   if(shipType.equals("U"))
		 
		   {
			   return new UFOEnemyShip();
		   }else if(shipType.equals("R")) 
		   {
			   return new RocketEnemyShip();
		   }else
		   {
			   return null;
		   }
		 
	 }
	
}

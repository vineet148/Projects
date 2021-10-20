package com.example.designpatterns.FactoryDesignPattern;

import java.util.Scanner;

public class ShipMainSetting {

	public static void main(String args[]) {
		EnemyShipFactory enemyShipFactory=new EnemyShipFactory();
		EnemyShip enemyShip=null;
      while(true)
      {
		System.out.print("What type of ship? (U / R / B)");
		Scanner userInput = new Scanner(System.in);
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
		     enemyShip=enemyShipFactory.CreateNewShip(typeOfShip);
		
		    if(enemyShip!=null)
		    {
		    	dostuff(enemyShip);
		    }else 
		    	{
		    	 System.out.print("Please enter U, R, or B next time");
		          break;
		    	}
		    }

	}
	}
	private static void dostuff(EnemyShip enemyShip) {
		// TODO Auto-generated method stub
		
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}

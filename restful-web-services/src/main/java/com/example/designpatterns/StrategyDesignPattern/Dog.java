package com.example.designpatterns.StrategyDesignPattern;

public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dug a hole");
	}

  public Dog()
  {
	  super();
	  setSound("Bark");
      flyingType=new CantFly();
  }
 
  //Incase we want to control the flying behaviour directly from Main method
  /*public void setFlyingType(Flys flyingType)
  {
	  this.flyingType=flyingType;
	  
  }*/

}

package com.example.designpatterns.AdapterDesignPattern;

public class EnemyAdapter implements IEnemyAdapter {

	Robotank robotank;
	
	
	public EnemyAdapter(Robotank robotank) {
		super();
		this.robotank = robotank;
	}

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub

		robotank.smashWithHand();
	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub

		robotank.walkforward();
	}

}

package com.example.designpatterns.StateDesignPattern;

public class ClosedGateState implements GateStates {

	Gate gate;

	public ClosedGateState(Gate gate) {
		// TODO Auto-generated constructor stub

		this.gate = gate;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

		System.out.println("gate is closed");
		 pay();
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
           System.out.println("pay first");
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void paySucced() {
		// TODO Auto-generated method stub

	}

}

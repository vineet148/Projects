package com.example.designpatterns.StateDesignPattern;

import java.util.Random;

public class OpenGateState implements GateStates {

	Gate gate;
	
	public OpenGateState(Gate gate) {
		// TODO Auto-generated constructor stub
	
	this.gate=gate;
	
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
		
		System.out.println("please enter");
		//now the changing the state to closed
		gate.changeState(new ClosedGateState(this.gate));
		
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
	
		int count=1;
		if(count==1)
		{
			System.out.println("payment failed");
			payFailed();
		}else {
			paySucced();
		}
		
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub
		
	    gate.changeState(new ClosedGateState(this.gate));    
		
	}

	@Override
	public void paySucced() {
		// TODO Auto-generated method stub
		gate.changeState(new OpenGateState(this.gate));
	}

}

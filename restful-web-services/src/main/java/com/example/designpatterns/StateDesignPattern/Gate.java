package com.example.designpatterns.StateDesignPattern;

public class Gate {

	GateStates gateStates;
	
	
	
	public Gate()
	{
		this.gateStates=new OpenGateState(this);
	}
	
	public void changeState(GateStates gateStates)
	{
		this.gateStates=gateStates;
		
	}
	
	public void enter() {
		
		gateStates.enter();
		
	}
	
	public void pay()
	{
		gateStates.pay();
	}
	
	public void payFailed()
	{
		gateStates.payFailed();
	}
	
	public void paySuccess()
	{
		gateStates.paySucced();
	}
	
}

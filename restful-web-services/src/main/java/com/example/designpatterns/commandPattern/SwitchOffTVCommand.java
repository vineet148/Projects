package com.example.designpatterns.commandPattern;

public class SwitchOffTVCommand implements ICommand {

	Television tv;
	
	
	public SwitchOffTVCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub

		tv.SwitchOff();
		
	}

	@Override
	public void Unexceute() {
		// TODO Auto-generated method stub

		tv.SwitchOn();
	}

}

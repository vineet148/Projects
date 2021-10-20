package com.example.designpatterns.commandPattern;

public class SwitchOnTVCommand implements ICommand {

	Television tv;

	public SwitchOnTVCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub

		tv.SwitchOn();
	}

	@Override
	public void Unexceute() {
		// TODO Auto-generated method stub

		tv.SwitchOff();
	}

}

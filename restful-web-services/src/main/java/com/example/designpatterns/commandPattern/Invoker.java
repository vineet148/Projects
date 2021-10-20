package com.example.designpatterns.commandPattern;

public class Invoker {

	ICommand SwitchOn;
	ICommand SwitchOff;
	ICommand VolumeUp;
	ICommand VolumeDown;

	public Invoker(ICommand switchOn, ICommand switchOff, ICommand volumeUp, ICommand volumeDown) {
		super();
		SwitchOn = switchOn;
		SwitchOff = switchOff;
		VolumeUp = volumeUp;
		VolumeDown = volumeDown;
	}

	public void SwitchOn() {

		SwitchOn.Execute();
	}

	public void SwitchOff() {

		SwitchOff.Execute();

	}
	
	public void VolumeUp(){
		VolumeUp.Execute();
	}
	
	public void VolumeDown()
	{
		VolumeDown.Execute();
	}

}

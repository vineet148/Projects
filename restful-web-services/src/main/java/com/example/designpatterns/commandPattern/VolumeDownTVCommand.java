package com.example.designpatterns.commandPattern;

public class VolumeDownTVCommand implements ICommand {

	Television tv;
	
	
	public VolumeDownTVCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub

		tv.volumeDown();
	}

	@Override
	public void Unexceute() {
		// TODO Auto-generated method stub

		tv.volumeUp();
	}

}

package com.example.designpatterns.commandPattern;

public class VolumeUpTVCommand implements ICommand {

	Television tv;

	public VolumeUpTVCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub

		tv.volumeUp();
	}

	@Override
	public void Unexceute() {
		// TODO Auto-generated method stub
		tv.volumeDown();
	}

}

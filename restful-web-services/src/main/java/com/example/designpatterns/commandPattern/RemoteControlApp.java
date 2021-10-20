package com.example.designpatterns.commandPattern;

public class RemoteControlApp {

	public static void main(String args[])
	{
		
		ICommand switchOnTv=new SwitchOnTVCommand(new Television());
		ICommand switchOfTV=new SwitchOffTVCommand(new Television());
		ICommand volumeUp=new VolumeUpTVCommand(new Television());
		ICommand volumeDown=new VolumeDownTVCommand(new Television());
	    
		Invoker invoker=new Invoker(switchOnTv, switchOfTV, volumeUp, volumeDown);
        invoker.SwitchOn();
        invoker.SwitchOff();
        invoker.VolumeUp();
        invoker.VolumeDown();
	
	}
	
}

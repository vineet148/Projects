package com.example.designpatterns.commandPattern;

public class Television {

	public void SwitchOn(){
		System.out.println("TV is switched on");
	}
	
	public void SwitchOff(){
		System.out.println("TV is switched OFF");
	}
	
	public void volumeUp() {
		System.out.println("volume up");
	}
	
	public void volumeDown() {
		System.out.println("volume Down");
	}
}

package com.example.designpatterns.ObserverDesignPattern;

public interface IObservabe {

	public void add(IObserver iObserver);
	public void remove(IObserver iObserver);
	public void notifyObserver();
	
	
}

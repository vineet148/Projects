package com.example.designpatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.Observer;
import java.util.Random;

public class StockMarket implements IObservabe {

	ArrayList<IObserver> listObservers=new ArrayList<>();
	ArrayList<Stock> stockList=new ArrayList<>();
	
	

	public void AddStock(Stock s)
	{
   
		stockList.add(s);
		notifyObserver();
	}
	
	public void GetRandomStock()
	{
       notifyObserver();
     
	}
	
	@Override
	public void add(IObserver iObserver) {
		// TODO Auto-generated method stub
		
		   listObservers.add(iObserver);
		
	}

	@Override
	public void remove(IObserver iObserver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(IObserver observer: listObservers)
		{
			
			observer.update();
		}
		
	}

}

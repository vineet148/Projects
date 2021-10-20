package com.example.designpatterns.ObserverDesignPattern;

public class Main {

	public static void main(String args[])
	{
		
		StockMarket stockMarket=new StockMarket();
		IObserver phone=new PhoneDisplay(stockMarket);
		IObserver tv=new TVDisplay(stockMarket);
	    
		stockMarket.add(phone);
		stockMarket.add(tv);
		Stock apple=new Stock(1,"Apple",13,"Monday");
		Stock google=new Stock(2,"google",15,"Monday");
		Stock tcs=new Stock(3,"TCS",20,"Monday");
		Stock oracle=new Stock(4,"Oracle",100,"Monday");
		
		stockMarket.AddStock(apple);
		stockMarket.AddStock(google);
		stockMarket.AddStock(tcs);
		stockMarket.AddStock(oracle);
	}
}

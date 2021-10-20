package com.example.designpatterns.ObserverDesignPattern;

import java.util.Random;

public class PhoneDisplay implements IObserver,Display {

	StockMarket stockMarket;
	Stock s;
	public PhoneDisplay(StockMarket stockMarket) {
		// TODO Auto-generated constructor stub
	
		this.stockMarket=stockMarket;
	}
	public int GenerateRandomStockLottery()
	{
		Random r=new Random();
		int num=r.nextInt(4);
		
		return num;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
	
		System.out.println("Added new Stock");
		for(Stock s: stockMarket.stockList)
		{
			
			Display(s);
		}
		
	}

	@Override
	public void Display(Stock s) {
		// TODO Auto-generated method stub
		
		System.out.println(s.getId() +" "+s.getName()+" "+s.getVal()+" "+s.DayOfWeek);
	}

}

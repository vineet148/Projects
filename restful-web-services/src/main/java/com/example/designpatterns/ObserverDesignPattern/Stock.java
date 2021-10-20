package com.example.designpatterns.ObserverDesignPattern;

import java.util.Random;

public class Stock {

	int id;
	String name;
	int val;
	String DayOfWeek;
	
	public Stock(int id,String name, int val, String dayOfWeek) {
		super();
		this.id=id;
		this.name = name;
		this.val = val;
		DayOfWeek = dayOfWeek;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public String getDayOfWeek() {
		return DayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		DayOfWeek = dayOfWeek;
	}

		
	
}

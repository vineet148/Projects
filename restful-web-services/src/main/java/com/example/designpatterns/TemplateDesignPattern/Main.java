package com.example.designpatterns.TemplateDesignPattern;

public class Main {

	public static void main(String args[])
	{
		Pizza p1=new VegPizza();
		p1.makePizze();
		Pizza p2=new NonVegPizza();
		p2.makePizze();
		
	}
}

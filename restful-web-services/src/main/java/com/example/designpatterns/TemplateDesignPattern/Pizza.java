package com.example.designpatterns.TemplateDesignPattern;

public abstract class Pizza {

	public final void makePizze() {
		cutTheBread();

		if (veggiesRequired()) {
			addVeggies();
		}
		addSausage();
		if (meatRequired()) {
			addMeat();
		}
		heatThePizza();
		packThePizza();

	}

	public boolean veggiesRequired() {
		return false;
	}

	public boolean meatRequired() {
		return false;
	}

	abstract void addVeggies();

	abstract void addSausage();

	abstract void addMeat();

	public void cutTheBread() {
		System.out.println("Bread is cutted");
	}

	public void Sausage() {
		System.out.println("Added Sausage");
	}

	public void heatThePizza() {
		System.out.println("Pizza got heated");
	}

	public void packThePizza() {
		System.out.println("Pack the pizza");
	}
}

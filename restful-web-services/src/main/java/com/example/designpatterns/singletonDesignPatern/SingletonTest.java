package com.example.designpatterns.singletonDesignPatern;

public class SingletonTest {

	public static void main(String args[])
	{

		Singleton singleton=Singleton.GetIntance();
		System.out.println(singleton.hashCode());
	   	System.out.println(singleton.removeLetter(2));
	}
}

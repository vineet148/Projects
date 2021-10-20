package com.example.designpatterns.iteratorDesignPattern;

import java.util.Iterator;

public class Main {

	public static void main(String args[])
	{

		songsof70s songsof70s=new songsof70s();
		songsof80s songsof80s=new songsof80s();
		
		Jockey jockey=new Jockey(songsof70s,songsof80s);
        jockey.showSongs2();
		
		
	}
}

package com.example.designpatterns.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class songsof80s implements iterator {

    Song[] bestSongs;
    int count=0;
	public songsof80s() {
		// TODO Auto-generated constructor stub

		 bestSongs= new Song[3];
	    bestSongs[0]=new Song("come to me world ", "Adele", "1982");
	    bestSongs[1]=new Song("world of the world ", "Adele", "1981");
	    bestSongs[2]=new Song("world of the world 2 ", "Adele", "1986");
	    
	}

	public Song[] bestSongs()
	{
		
		return bestSongs;
	}
	
	
	@Override
	public Iterator createIterator()
	{
		
		return Arrays.asList(bestSongs).iterator();
		
	}
}

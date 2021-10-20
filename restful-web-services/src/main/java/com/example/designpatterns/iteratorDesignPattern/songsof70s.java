package com.example.designpatterns.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class songsof70s implements iterator {

	ArrayList<Song> listOfSongs;

	public songsof70s() {
		// TODO Auto-generated constructor stub

		listOfSongs = new ArrayList<>();
		listOfSongs.add(new Song("world of me ", "Adele", "1971"));
		listOfSongs.add(new Song("come to world ", "shakira", "1974"));
		listOfSongs.add(new Song("world  ", "eminem", "1976"));
	}

	public ArrayList<Song> bestSongs()
	{
		
		return listOfSongs;
	}
	
	@Override
	public Iterator createIterator()
	{
		return listOfSongs.iterator();
		
		
	}
	
	
}

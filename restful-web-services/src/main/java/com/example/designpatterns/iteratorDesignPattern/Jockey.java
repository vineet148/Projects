package com.example.designpatterns.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Jockey {

	iterator songs70s;
	iterator songs80s;

	public Jockey(iterator newSongsof70s, iterator newSongsof80s) {
		// TODO Auto-generated constructor stub
		songs70s = newSongsof70s;
		songs80s = newSongsof80s;

	}

	public void showSongs2() {

		Iterator songof70s = (Iterator) songs70s.createIterator();
		Iterator songof80s = (Iterator) songs80s.createIterator();
		
		System.out.println("best song for 70s");
		display(songof70s);
		System.out.println("best song for 80s");
		display(songof80s);
		
	}

	private void display(Iterator itr) {
		// TODO Auto-generated method stub
		while(itr.hasNext())
		{
			Song song=(Song) itr.next();
			System.out.println(song.getName()+" "+song.getArtist()+" "+
			song.getCreationDate());
		}
		
	}

}

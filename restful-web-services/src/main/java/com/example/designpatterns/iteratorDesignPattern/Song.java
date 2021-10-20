package com.example.designpatterns.iteratorDesignPattern;

public class Song {

	String name;
	String artist;
	String creationDate;
	
	public Song(String name, String artist, String creationDate) {
		super();
		this.name = name;
		this.artist = artist;
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	

}
package com.example.designpatterns.singletonDesignPatern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Singleton {

	String[] letter = { "a", "b", "c", "d" };
	LinkedList<String> letterList = new LinkedList<>(Arrays.asList(letter));
	static Singleton instance = null;

	private Singleton() {

	};

	public static Singleton GetIntance() {
		if (instance == null) {
			instance = new Singleton();

		}
		return instance;

	}

	public LinkedList<String> removeLetter(int num) {
		LinkedList<String> removedLetterList = new LinkedList<>();
		for (int i = 0; i < num; i++) {
			removedLetterList.add(letterList.remove(0));
		}
		return removedLetterList;

	}

}

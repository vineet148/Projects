package com.example.MultiThreadingDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processer implements Runnable {

	private int id;

	Processer(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("starting " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Finished " + id);

	}
}

public class ThreadPoolDemo {

	public static void main(String args[]) {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++)
		{
			executor.submit(new Processer(i));
		}
		executor.shutdown();
	   System.out.println("All task submitted");
	   try {
		executor.awaitTermination(1, TimeUnit.DAYS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}

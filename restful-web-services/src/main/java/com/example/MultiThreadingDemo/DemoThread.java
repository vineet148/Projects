package com.example.MultiThreadingDemo;

import java.util.Scanner;

public class DemoThread {

	public static void main(String args[]) {

		Runner runner1 = new Runner();
		runner1.start();
		System.out.println("Enter the new line to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		runner1.shutDown();
		System.out.println("stopped");

		Runner runner2 = new Runner();
		runner2.start();

		Thread t1 = new Thread(new RunnableRunner());
		t1.start();

		Thread t2 = new Thread(new RunnableRunner());
		t2.start();

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("Hello" + i);
				}

				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated
					e.printStackTrace();
				}

			}
		});

		t3.start();
	}

}

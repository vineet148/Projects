package com.example.MultiThreadingDemo.WaitAndNotifyDemo;

import java.util.Scanner;

public class WaitAndNotify {

	public static void main(String args[]) throws InterruptedException {
		Processor processor = new Processor();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					processor.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				try {
					processor.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}

class Processor {
	public void produce() throws InterruptedException {

		synchronized (this) {

			System.out.println("producer thread running..");
			wait();
			System.out.println("Resumed");

		}
	}

	public void consume() throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		Thread.sleep(11000);
		System.out.println("Consumer thread is running");
		synchronized (this) {

			System.out.println("waiting for the return key");
			scanner.nextLine();
			System.out.println("return key pressed");
			notify();
			Thread.sleep(4000);

		}

	}

}
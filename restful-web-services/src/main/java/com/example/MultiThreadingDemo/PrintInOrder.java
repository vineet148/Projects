package com.example.MultiThreadingDemo;

class FooBar {

	public void first() {
		System.out.println("first");

	}

	public void second() {
		System.out.println("second");
	}

	public void third() {
		System.out.println("third");
	}
}

public class PrintInOrder {

	public static void main(String args[]) throws InterruptedException {
		FooBar fooBar = new FooBar();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				fooBar.first();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				fooBar.second();
				;
			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				fooBar.third();
				;
			}
		});

		// Join method will make sure that threads are executed after previous threads
		// finished
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}

}
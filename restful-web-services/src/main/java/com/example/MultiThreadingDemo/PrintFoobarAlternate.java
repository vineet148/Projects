package com.example.MultiThreadingDemo;

import java.util.Scanner;

class FooBar1 {

	private int n;

	public FooBar1(int n) {
		this.n = n;
	}

	StringBuffer str=new StringBuffer();
	Boolean signal=true;

	public void Foo() throws InterruptedException {

		synchronized (this) {
			for (int i = 0; i < n; i++) {

				System.out.print("Foo");
				wait();
				notify();
			}

		}
	}

	public void Bar() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < n; i++) {
				System.out.print("Baar ");
			    notify();
			    wait();
			}

		}
	}
	
	public void finished()
	{
		System.out.println(str);
	}
}

public class PrintFoobarAlternate {

	public static void main(String args[]) throws InterruptedException {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		FooBar1 fooBar = new FooBar1(n);
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				try {
					fooBar.Foo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				try {
					fooBar.Bar();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;
			}
		});

		// Join method will make sure that threads are executed after previous threads
		// finished
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	   fooBar.finished();
	}

}
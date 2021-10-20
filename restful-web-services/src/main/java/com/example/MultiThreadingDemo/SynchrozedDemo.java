package com.example.MultiThreadingDemo;

public class SynchrozedDemo {

	private int count = 0;

	public static void main(String args[]) {

		SynchrozedDemo synchrozedDemo = new SynchrozedDemo();
		SynchrozedDemo synchrozedDemo2 = new SynchrozedDemo();
		synchrozedDemo.doWork();
		synchrozedDemo2.doWork();

	}

	public synchronized void increment() {
		count++;
	}
	public synchronized void increment2() {
		count++;
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub

				for (int i = 0; i < 10000; i++) {
					increment();
					increment2();

				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub

				for (int i = 0; i < 10000; i++) {
					increment();
					increment2();

				}

			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(count);
	}

}

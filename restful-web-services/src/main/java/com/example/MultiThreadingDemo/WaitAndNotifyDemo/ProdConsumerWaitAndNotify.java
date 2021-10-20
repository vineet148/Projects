package com.example.MultiThreadingDemo.WaitAndNotifyDemo;

import java.util.LinkedList;

public class ProdConsumerWaitAndNotify {

	public static void main(String args[]) throws InterruptedException {
		Processor1 processor = new Processor1();
		
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

class Processor1 {

	private LinkedList<Integer> list = new LinkedList<Integer>();
	private Integer limit = 10;
	Object lock = new Object();
	int count = 0;

	public void produce() throws InterruptedException {

		synchronized (lock) {

			while (true) {

				while (list.size() == limit) {
					lock.wait();
				}

				list.add(count++);
				lock.notify();
			}
		}
	}

	public void consume() throws InterruptedException {

		System.out.println("consumer thread running");
		while (true) {
			synchronized (lock) {

				while (list.size() == 0) {
					lock.wait();
				}
				int value = list.removeFirst();
				System.out.println("value is " + value + " list size is" + list.size());
				lock.notify();

			}
			Thread.sleep(2000);
		}

	}

}
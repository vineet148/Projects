package com.example.MultiThreadingDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocksDemo {

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();
	Random random = new Random();
	Object object1 = new Object();
	Object object2 = new Object();

	private void stageOne() {

		synchronized (object1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));

		}

	}

	private void stageTwo() {

		synchronized (object2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));

		}

	}

	private void process() {
		stageOne();
		stageTwo();
	}

	public static void main(String args[]) {
		MultipleLocksDemo multipleLocksDemo = new MultipleLocksDemo();

		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100; i++) {

					multipleLocksDemo.process();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100; i++) {

					multipleLocksDemo.process();
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

		long end = System.currentTimeMillis();
		System.out.println("time taken" + (end - start));
		System.out.println(multipleLocksDemo.list1.size() + " " + multipleLocksDemo.list2.size());

	}

}

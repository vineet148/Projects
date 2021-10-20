package com.example.MultiThreadingDemo;

public class Runner extends Thread {

	private volatile Boolean running = true;

	@Override
	public void run() {

		while (running) {
			for (int i = 0; i < 10; i++) {

				System.out.println("Hello" + i);
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void shutDown() {
		running = false;
	}
}

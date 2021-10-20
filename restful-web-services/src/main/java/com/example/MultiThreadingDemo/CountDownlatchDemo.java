package com.example.MultiThreadingDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {

	private CountDownLatch latch;

	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("started with id"+latch);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
		
		System.out.println("Finished and "+latch.getCount()+"left");
	}

}

public class CountDownlatchDemo {

	public static void main(String args[]) {

		CountDownLatch latch=new CountDownLatch(3);
		ExecutorService executors= Executors.newFixedThreadPool(1);
	
		/*for(int i=0; i<3 ;i++)
		{
			executors.submit(new Processor(latch));
		}*/
		
		executors.submit(new Processor(latch));
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed");
	}
	
}
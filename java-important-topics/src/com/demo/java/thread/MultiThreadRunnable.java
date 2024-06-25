package com.demo.java.thread;

public class MultiThreadRunnable implements Runnable {
	private int threadnuber;
	public MultiThreadRunnable(int threadnuber) {
		super();
		this.threadnuber = threadnuber;
	}
	public void run()
	{
		int i=0;
		for(i=0; i<10; i++)
		{
			System.out.println("MultiThreadRunnable : Thread Number : "+threadnuber+" Iteration : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

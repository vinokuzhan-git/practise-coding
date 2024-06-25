package com.demo.java.thread;

public class MultiThreadMain {

	public static void main(String[] args) {
		int i=0;
		for (i=0;i<5;i++)
		{
			MutiThread m = new MutiThread(i);
			m.start();
		}
		
		System.out.println("Thread using Runnable stats Below : ");
		
		for (i=11;i<20;i++)
		{
			MultiThreadRunnable m = new MultiThreadRunnable(i);
			Thread t = new Thread(m);
			t.start();
		}
	}

}

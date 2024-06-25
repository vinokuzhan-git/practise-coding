package com.demo.java.thread;

public class MutiThread extends Thread {

	private int threadnuber;
	public MutiThread(int threadnuber) {
		super();
		this.threadnuber = threadnuber;
	}	
	
	@Override
	public void run()
	{
		int i=0;
		for(i=0; i<10; i++)
		{
			System.out.println("MutiThread : Thread Number : "+threadnuber+" Iteration : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

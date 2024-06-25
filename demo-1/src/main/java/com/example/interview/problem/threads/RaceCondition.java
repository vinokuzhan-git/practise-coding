package com.example.interview.problem.threads;

class C
{
	int count=0;
	
	public synchronized void increment()
	{
		count++;
	}
	
	}

public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		
		Runnable a = () ->
			{
				for(int i=0;i<10000;i++)
					c.increment();
			};
			
			Runnable b = () ->
			{
				for(int i=0;i<10000;i++)
					c.increment();
			};
			
			Thread t1 = new Thread(a);
			Thread t2 = new Thread(b);
			t1.start();
			t2.start();
			
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(c.count);

	}

}

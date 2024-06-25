package com.demo.java.vectorarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorArrayListMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int maxlength=10000000;
		List<Integer> vector = new Vector<>();
		int i=0;
		Long start = System.currentTimeMillis();
		// System.out.println("StartTime : "+System.currentTimeMillis());
		for(i=0;i<maxlength;i++)
		{
			vector.add(i);
		}
		Long end = System.currentTimeMillis();
		System.out.println("Time taken for adding value of lenght : "+maxlength+" to Vector is "+(end-start)+"ms");
		
		
		List<Integer> arrayList = new ArrayList<>();
		i=0;
		start = System.currentTimeMillis();
		// System.out.println("StartTime : "+System.currentTimeMillis());
		for(i=0;i<maxlength;i++)
		{
			arrayList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken for adding value of lenght : "+maxlength+" to ArrayList is "+(end-start)+"ms");
		
		System.out.println("Multi-Thread starts Here !!");
		
		i=0;
		arrayList.clear();
		start = System.currentTimeMillis();
		// System.out.println("StartTime : "+System.currentTimeMillis());
		Thread t1 = new Thread(() -> {
			for(int j=0;j<maxlength;j++)
			{
				arrayList.add(j);
			}
		});
		Thread t2 = new Thread(() -> {
			for(int j=0;j<maxlength;j++)
			{
				arrayList.add(j);
			}
		});
		Thread t3 = new Thread(() -> {
			for(int j=0;j<maxlength;j++)
			{
				arrayList.add(j);
			}
		});
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		end = System.currentTimeMillis();
		System.out.println("Time taken for adding value of lenght : "+arrayList.size()+" to Multi-Thread ArrayList is "+(end-start)+"ms");

		i=0;
		vector.clear();
		start = System.currentTimeMillis();
		// System.out.println("StartTime : "+System.currentTimeMillis());
		t1 = new Thread(() -> {
			for(int j=0;j<maxlength;j++)
			{
				vector.add(j);
			}
		});
		t2 = new Thread(() -> {
			for(int j=0;j<maxlength;j++)
			{
				vector.add(j);
			}
		});
		t3 = new Thread(() -> {
			for(int j=0;j<maxlength;j++)
			{
				vector.add(j);
			}
		});
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		end = System.currentTimeMillis();
		System.out.println("Time taken for adding value of lenght : "+vector.size()+" to Multi-Thread Vector is "+(end-start)+"ms");
	}
	
	
	
	



}

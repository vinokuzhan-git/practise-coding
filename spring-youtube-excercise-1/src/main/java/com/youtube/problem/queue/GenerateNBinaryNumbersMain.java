package com.youtube.problem.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNBinaryNumbersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateNBinaryNumbers(100);
	}
	
public static void GenerateNBinaryNumbers(int n)
{
	Queue<String> q = new LinkedList<>();
	
	q.add(1+"");
	int i=2;
	
	while(!q.isEmpty())
	{
		String value=q.poll();
		System.out.println(value);
		if(i++ <= n)
			q.add(value+0);
		if(i++ <= n)
			q.add(value+1);
	}	
}

}

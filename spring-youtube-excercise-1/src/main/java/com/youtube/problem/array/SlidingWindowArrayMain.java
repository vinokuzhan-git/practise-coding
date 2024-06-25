package com.youtube.problem.array;

public class SlidingWindowArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {44,77,33,44,88,11};
		int start=0;
		int k=3;
		int end = (start+k)-1;
		
		while(end < arr.length)
		{
			int max=arr[start];
			int i=end;
			
			while(start<i)
			{
				if(max < arr[i])
				{
					max=arr[i];
				}	
				i--;
			}
			System.out.println("start : "+start+" End : "+end+" Max : "+max);
			start++;
			end = (start+k)-1;
		}	

	}

}

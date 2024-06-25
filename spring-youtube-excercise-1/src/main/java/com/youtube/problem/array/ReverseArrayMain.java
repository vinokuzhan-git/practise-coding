package com.youtube.problem.array;

public class ReverseArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8};
		//int revarr[]= reverseArray(arr);
		int revarr[]= reverseArrayyoutube(arr);
		
		for(int i : revarr)
		{
			System.out.print(i+" ");
		}	

	}
	
	public static int[] reverseArray(int[] arr)
	{
		int[] revarr = new int[arr.length];
		int i=0;
		
		for(int j=arr.length-1;j>=0;j--)
		{
			revarr[i++]=arr[j];
		}
		return revarr;
	}
	
	public static int[] reverseArrayyoutube(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start < end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}	
		return arr;
	}

}

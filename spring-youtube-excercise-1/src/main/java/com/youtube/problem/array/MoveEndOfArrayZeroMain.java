package com.youtube.problem.array;

public class MoveEndOfArrayZeroMain {

	public static void main(String[] args) {
		int[] arr = {5,6,3,0,4,0,9,7};
		//arr = endOfZero(arr);
		arr = endOfZeroNonZeroElementInSameOrder(arr);
		for(int i : arr)
			System.out.print(i);

	}
	
	public static int[] endOfZero(int[] arr)
	{
		int x=arr.length-1;
		for(int i=0;i<x;i++)
		{
			System.out.println("i : "+i+" arr[i]"+arr[i]+" arr[x]"+arr[x]);
			if((arr[i] == 0 ) && (arr[x] !=0 ))
			{	
				arr[i]=arr[x];
				arr[x] = 0;
				x--;
			}
			else if((arr[i] == 0 ) && (arr[x] == 0 ))
			{
				x=x-1;
				i=i-1;
			}	
				
		}	
		return arr;
	}
	
	public static int[] endOfZeroNonZeroElementInSameOrder(int[] arr)
	{
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("i : "+i+" arr[i]"+arr[i]+" arr[x]"+arr[x]);
			if((arr[i] != 0 ) && (arr[x] == 0))
			{	
				int temp=arr[i];
				//arr[x] = arr[i];
				arr[i]=arr[x];
				arr[x] = temp;
			}
			
			if(arr[x] != 0)
				x++;
				
		}	
		return arr;
	}

}

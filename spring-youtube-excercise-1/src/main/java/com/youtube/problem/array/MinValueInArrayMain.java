package com.youtube.problem.array;

public class MinValueInArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,3,2,7,5,1,9};
		int min = findMinVal(arr);
		System.out.print("Min val : "+min);

	}

	public static int findMinVal(int[] arr)
	{
		int minval = Integer.MAX_VALUE;
		for(int i : arr)
		{
			if(i<minval)
				minval=i;
		}
		return minval;
	}
}

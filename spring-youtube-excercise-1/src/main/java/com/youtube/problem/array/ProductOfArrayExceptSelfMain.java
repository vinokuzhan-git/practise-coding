package com.youtube.problem.array;

public class ProductOfArrayExceptSelfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4};
		int temp=1;
		int[] result = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			result[i]=temp;
			temp=temp*arr[i];
		}
		temp=1;
		for(int i= arr.length-1;i>=0;i--)
		{
			result[i] = result[i]*temp;
			temp = temp*arr[i];
		}
		System.out.println("Print Below List: ");
		for(int i : result)
			System.out.print(i+" ");

	}

}

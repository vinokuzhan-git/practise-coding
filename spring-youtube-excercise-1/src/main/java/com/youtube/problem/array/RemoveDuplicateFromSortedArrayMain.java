package com.youtube.problem.array;

public class RemoveDuplicateFromSortedArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int j=0, val=-1;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != val)
			{
				nums[j++]=nums[i];
				val=nums[i];
			}	
		}
		
		System.out.println("Print values : j : "+j);
		for(int i=0;i<j;i++)
			System.out.print(nums[i]+" ");

	}

}

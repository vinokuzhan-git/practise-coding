package com.youtube.problem.array;

public class RemoveElementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1,2,2,3,0,4,2};
		int val=2;
		int i=1, j=0;
		
		for(i=0;i<nums.length;i++)
		{
			if(nums[i] != val)
			{
				nums[j++]=nums[i];
			}	
		}	
		
	/*	while(i < nums.length)
		{
			//if(nums[i] == val)
			if((nums[j] == val) && (nums[i] != val))
			{	
				int temp=nums[j];
				nums[j]= nums[i];
				nums[i]=temp;
			}
			if(nums[i] == val)
				i++;
			if(nums[j] != val)
			{	
				j++;
				i++;
			}
		}*/
		System.out.println("Print values : j : "+j);
		for(i=0;i<j;i++)
			System.out.print(nums[i]+" ");
	}
	

}

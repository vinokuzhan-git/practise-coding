package com.youtube.problem.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumProblemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,4,3,7,1,8,9,0};
		int target=6;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++)
		{
			int j=i+1;
			int k=nums.length-1;
			
			while(j < k)
			{
				int sum = nums[i] + nums[j] +nums[k];
				
				if(sum == target)
				{
					System.out.println("{"+nums[i]+","+nums[j]+","+nums[k]+"}");
					j++;
					k--;
				}	
				else if(sum > target)
				{
					k--;
				}	
				else
				{
					j++;
				}	
			}	
		}	

	}

}

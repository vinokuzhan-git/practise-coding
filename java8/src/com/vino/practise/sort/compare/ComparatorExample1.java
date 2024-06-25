package com.vino.practise.sort.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ComparatorExample1 {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(89);
		nums.add(67);
		nums.add(38);
		nums.add(96);
		nums.add(74);
		
		Collections.sort(nums);
		System.out.println("Sort by actual value : "+nums);
		
		System.out.println("Now we have to see how to sort based on the 2nd digit of the number using comparator");
		
		Comparator<Integer> com = (i,j) -> {
			if(i%10 > j%10)
				return 1;
			else
				return -1;
		};
		Collections.sort(nums, com);
		System.out.println("Sort by actual value : "+nums);
	}

}

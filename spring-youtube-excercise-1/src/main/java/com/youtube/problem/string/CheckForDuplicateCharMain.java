package com.youtube.problem.string;

import java.util.HashMap;

public class CheckForDuplicateCharMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="codefforrcode";
		int index=-1;
		
		char arr[] = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(char c : arr)
			hm.put(c, hm.getOrDefault(c, 0)+1);
		
		for(int i=0;i<arr.length;i++)
			if(hm.get(arr[i]) == 1)
			{
				index=i;
				break;
			}	
		System.out.println("final index : "+index);		

	}

}

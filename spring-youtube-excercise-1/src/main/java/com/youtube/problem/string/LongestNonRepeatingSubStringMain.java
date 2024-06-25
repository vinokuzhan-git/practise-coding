package com.youtube.problem.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubStringMain {

	public static void main(String[] args) {
		// String str="abcabcbb";
		String str="abcdefghijklmnoprstuvwxyza";
		char chr[] = str.toCharArray();
		int max=0;
		int size=0;
		Set<Character> chrset = new HashSet<Character>();
		for(char c : chr)
		{			
				chrset.add(c);
				size++;
				if(size > chrset.size())
				{
					//chrset=new HashSet<Character>();
					chrset.clear();
					if(max < size)
						max=size-1;
					size=0;
			     }
		}	
		System.out.println("Max Size : "+max);

	}

}

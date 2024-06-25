package com.youtube.problem.string;

public class PalendromStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MADAM";
		
		int start=0;
		int end = str.length()-1;
		boolean flag=true;
		
		while(start < end)
		{
			if(str.charAt(start++) != str.charAt(end--))
			{
				flag= false;
			}	
		}	
		System.out.println(str.charAt(str.length()-1));
		System.out.println("flag : "+flag);

	}

}

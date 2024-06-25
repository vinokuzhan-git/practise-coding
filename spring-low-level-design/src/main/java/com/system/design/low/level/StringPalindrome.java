package com.system.design.low.level;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MAD dAM";
		int start=0;
		int end=str.length()-1;
		boolean flag=true;
		
		while(start <= end)
		{
			if(str.charAt(start++) == str.charAt(end--))
			{
				
			}	
			else
			{
				flag=false;
				break;
			}	
		}	
		
		System.out.println(flag);
		for(int i=0;i<str.length();i++)
		{
			
		}	

	}

}

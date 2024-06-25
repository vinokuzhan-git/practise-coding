package com.java.ds.palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=121;
		int modval=0;
		int num=start;
		while(num >= 1)
		{
			modval = num%10+modval*10;
			num = num/10;
		}
		System.out.println("modval : "+modval);
		if(start == modval)
			System.out.println("true");
		else
			System.out.println("false");

	}

}

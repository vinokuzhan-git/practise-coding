package com.java.ds.palindrome;

public class Solution {

	public static void main(String[] args) {
		 longestPalindrome("babad");

	}
	
	 public static String longestPalindrome(String s) {
	        String finalstr="";
	        String temp="";
	        String reverse="";
	        reverse=reverse(s);
	       System.out.println("s : "+s+" reverse : "+reverse); 
	        temp=splitStr(s);
	        System.out.println("temp :: "+temp); 
	        if(finalstr.length() < temp.length())
	        {
	            finalstr = temp;
	        }
	        System.out.println("finalstr : S : "+finalstr);
	         temp=splitStr(reverse);
	        if(finalstr.length() < temp.length())
	        {
	            finalstr = temp;
	        }
	        s=s.substring(1,s.length()-1);
	        if(s.length() > finalstr.length())
	        {
	        	temp = longestPalindrome(s);
	        }
	        if(finalstr.length() < temp.length())
	        {
	            finalstr = temp;
	        }
	        System.out.println("finalstr : reverse : "+finalstr);
	        return finalstr;
	    }
	    public static String reverse(String s)
	    {
	        String temp="";
	        int i=s.length()-1;
	        while(i >= 0)
	        {
	            temp=temp+s.charAt(i);
	          //  System.out.println("temp["+i--+"] : "+temp);
	            i--;
	        }
	        return temp;
	    }
	    public static String splitStr(String s)
	    {
	        System.out.println("splitStr : "+s);
	        while(s.length() >= 1)
	        {
	        	 System.out.println("while splitStr : "+s);
	            if(s.equals(reverse(s)))
	            {
	                return s;
	            }
	            else
	            {
	                s=s.substring(0,s.length()-1);
	            }
	        }
	        return "";
	    }

}

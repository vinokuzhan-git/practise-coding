package com.java.ds.longstring;

public class LongStringMain {

	public static void main(String[] args) {
		lengthOfLongestSubstring("pwwkew");

	}
	
	public static int lengthOfLongestSubstring(String s) {
        String r = "";
        int j=0;
        String f="";
    while(s.length() >= 1)
    {
    	j=1;
        r = "";
       // j++;
        for(int i=0;i<s.length();i++)
        {
            if(r.contains(s.charAt(i)+""))
            {
                break;
            }
            else
            {
               r= r+s.charAt(i);
            }
        }
        s=s.substring(j,s.length());
        System.out.println("s : "+s);
        System.out.println("r : "+r);
        if(r.length()>f.length())
            f=r;
    }
    System.out.println("f : "+f);
        return f.length();
        
    }

}

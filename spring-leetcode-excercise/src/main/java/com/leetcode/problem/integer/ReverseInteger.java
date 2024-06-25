package com.leetcode.problem.integer;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		;
		
		System.out.println("Result : "+reverse(1534236469));

	}

	 public static int reverse(int x) {
	        int result=0;
	        while(x != 0)
	        {
	            int r = x%10;
	            x=x/10;
	            result=result*10+r;
	            System.out.println(result);
	            if(result < -2147483648 || result > 2147483647)
	                break;

	        }
	        if(result >= -2147483648 || result <= 2147483647)
	            return result;
	        else
	            return 0;
	        
	    }
}

package com.java.ds.palindrome;

public class LinkedListSolution {
	 public boolean isPalindrome(ListNode head) {
	        ListNode node = head;
	        String val="";
	        System.out.println("head : "+head.val);
	        while(node != null)
	        {
	            val= val+node.val;
	            node = node.next;
	        } 
	        int start = Integer.parseInt(val);
			int modval=0;
			int num=start;
			while(num >= 1)
			{
				modval = num%10+modval*10;
				num = num/10;
			}
	        if(start == modval)
				return true;
			else
				return false;
	      
	    }
}

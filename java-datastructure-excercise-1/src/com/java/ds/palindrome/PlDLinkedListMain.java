package com.java.ds.palindrome;

public class PlDLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n3=new ListNode(1);
		ListNode n2=new ListNode(2,n3);
		ListNode n1=new ListNode(2,n2);
		ListNode head=new ListNode(1,n1);
		
		LinkedListSolution l = new LinkedListSolution();
		boolean r=l.isPalindrome(head);
		System.out.println("r : "+r);
	}

}

package com.youtube.problem.array;

import java.util.Stack;

public class ValidParanthesisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = validParanthesise("{[]}");
		System.out.println("result : "+result);

	}
	
	public static boolean validParanthesise(String s)
	{
		char[] chararr = s.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : chararr)
		{
			
			if((c == '(') || (c == '{') || (c == '['))
			{
				stack.push(c);
			}
			else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else
				{
					//System.out.println("c : "+c+" peek : "+stack.peek());
					if(c == ')' && stack.peek() == '(')
					{
						stack.pop();
					}
					else if(c == '}' && stack.peek() == '{')
					{
						stack.pop();
					}
					else if(c == ']' && stack.peek() == '[')
					{
						stack.pop();
					}
					else
					{
						return false;
					}	
				//	System.out.println("c : "+c+" peek : "+stack.peek());
				}	
			}	
		}	
		return stack.isEmpty();
	}

}

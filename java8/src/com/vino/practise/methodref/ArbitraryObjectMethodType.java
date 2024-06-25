package com.vino.practise.methodref;

import java.util.function.BiFunction;

/*
class ArbitraryObjectMethodRef
{
	int multiply(int a, int b)
	{
		return a*b;
	}
}
*/
public class ArbitraryObjectMethodType {
	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> result = Integer::compare;
		int c = result.apply(39, 35);
		System.out.println("Multiplication Result : "+c);
	}
}

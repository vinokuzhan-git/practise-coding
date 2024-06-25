package com.demo.java.generics;

public class GenericPrinter <T> {

	T printValue;
	
	public void setValue(T value)
	{
		printValue=value;
	}
	
	public void print()
	{
		System.out.println("printValue : "+printValue);
	}
}

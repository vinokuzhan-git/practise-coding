package com.demo.java.generics;

public class GroceriesPrinter <T extends Groceries> {

	T obj;

	public GroceriesPrinter(T obj) {
		super();
		this.obj = obj;
	}
	
	public void print()
	{
		System.out.println(obj.printGroceries());
	}
}

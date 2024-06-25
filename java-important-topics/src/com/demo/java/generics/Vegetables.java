package com.demo.java.generics;

public class Vegetables extends Groceries {
	
String VegName;
	
	public Vegetables(String vegName) {
	super();
	VegName = vegName;
}
	
	@Override
	public String printGroceries()
	{
		//printGroceries(VegName);
		System.out.println("Printing Vegetables !!");
		return this.VegName; 
	}
}

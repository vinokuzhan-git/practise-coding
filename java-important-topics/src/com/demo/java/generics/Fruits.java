package com.demo.java.generics;

public class Fruits extends Groceries {
	
	String FruitName;

	public Fruits(String fruitName) {
		super();
		FruitName = fruitName;
	}
	
	@Override
	public String printGroceries()
	{
		//printGroceries(VegName);
		System.out.println("Printing Fruits !!");
		return this.FruitName; 
	}

}

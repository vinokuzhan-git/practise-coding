package com.demo.java.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsMain {
	
	public static void main(String[] args) {
		GenericPrinter<Integer> intprinter = new GenericPrinter<>();
		intprinter.setValue(100);
		intprinter.print();
		
		GenericPrinter<Double> doubleprinter = new GenericPrinter<>();
		doubleprinter.setValue(9.2);
		doubleprinter.print();
		
		GroceriesPrinter<Vegetables> veg = new GroceriesPrinter<>(new Vegetables("Brinjaal"));
		veg.print();
		
		GroceriesPrinter<Fruits> fruit = new GroceriesPrinter<>(new Fruits("Mango"));
		fruit.print();
		squareMethod(23);

	/*	List<Integer> intlist = new ArrayList<>();
		intlist.add(100);
		intlist.add(200);
		intlist.add(300);
		
		printList(intlist); */

		
		List<String> stringlist = new ArrayList<>();
		stringlist.add("Vinoth");
		stringlist.add("Kuzhanthaiyan");
		stringlist.add("Vinokuzhan");
		
		printList(stringlist);
		
	//	Map map = new HashMap();
		
		
	}
	
	public static <T extends Number> void squareMethod(T number)
	{
		System.out.println("Square : "+number.intValue()*number.intValue());
	}
	
	public static void printList(List<?> list)
	{
		System.out.println("Generic List : "+list);
	}

}

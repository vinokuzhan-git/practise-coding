package com.system.design.low.level.design.pattern.decoratorpattern;

public class DecoratorDesignPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage milkbeverage = new Milk();
		System.out.println("beverage : "+milkbeverage.getName()+" Price : "+milkbeverage.getPrice());
		System.out.println();
		
		Beverage hotwaterbeverage = new HotWater();
		System.out.println("beverage : "+hotwaterbeverage.getName()+" Price : "+hotwaterbeverage.getPrice());
		System.out.println();
		
		milkbeverage = new Coffee(milkbeverage);
		System.out.println("beverage : "+milkbeverage.getName()+" Price : "+milkbeverage.getPrice());
		System.out.println();
		
	/*	milkbeverage = new Tea(milkbeverage);
		System.out.println("beverage : "+milkbeverage.getName()+" Price : "+milkbeverage.getPrice());
		System.out.println(); */
		
		milkbeverage = new Sugar(milkbeverage);
		System.out.println("beverage : "+milkbeverage.getName()+" Price : "+milkbeverage.getPrice());
		System.out.println();

	}

}

package com.system.design.low.level.design.pattern.decoratorpattern;

public abstract class IncredibleAddons extends Beverage {
	Beverage beverage;
	int price;
	
	public String getName()
	{
		return beverage.getName()+ " with " +this.getClass().getSimpleName();
	}
	
	public int getPrice()
	{
		return beverage.getPrice()+this.price;
	}
}

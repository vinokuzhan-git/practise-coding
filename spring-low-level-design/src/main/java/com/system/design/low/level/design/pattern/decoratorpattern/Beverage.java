package com.system.design.low.level.design.pattern.decoratorpattern;

public abstract class Beverage {
	
	String name="Beverage";
	
	public String getName()
	{
		return name;
	}
	
	public abstract int getPrice();

}

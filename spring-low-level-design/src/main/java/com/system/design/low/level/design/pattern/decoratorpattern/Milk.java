package com.system.design.low.level.design.pattern.decoratorpattern;

public class Milk extends Beverage {
	
	public Milk()
	{
		this.name="Milk";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 12;
	}

}

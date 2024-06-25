package com.system.design.low.level.design.pattern.decoratorpattern;

public class Coffee extends IncredibleAddons {

	public Coffee(Beverage beverage)
	{
		this.beverage = beverage;
		this.price=10;
	}

}

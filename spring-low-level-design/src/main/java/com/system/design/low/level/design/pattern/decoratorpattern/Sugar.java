package com.system.design.low.level.design.pattern.decoratorpattern;

public class Sugar extends IncredibleAddons {
	public Sugar(Beverage beverage)
	{
		this.beverage=beverage;
		this.price=3;
	}
}

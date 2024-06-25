package com.system.design.low.level.design.pattern.decoratorpattern;

public class Tea extends IncredibleAddons {
	
	public Tea(Beverage beverage)
	{
		this.beverage=beverage;
		this.price=4;
	}

}

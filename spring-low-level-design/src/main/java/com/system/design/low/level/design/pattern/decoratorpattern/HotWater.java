package com.system.design.low.level.design.pattern.decoratorpattern;

public class HotWater extends Beverage {
	
	public HotWater()
	{
		this.name="HotWater";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 6;
	}

}

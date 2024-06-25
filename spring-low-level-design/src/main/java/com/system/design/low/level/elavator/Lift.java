package com.system.design.low.level.elavator;

import java.util.ArrayList;
import java.util.List;

public class Lift {

	int currentfloor;
	String leftName;
	String state;
	Button floorbutton;
	List events = new ArrayList();
	public Lift(String leftName) {
		super();
		this.leftName = leftName;
	}
	
	
    
}

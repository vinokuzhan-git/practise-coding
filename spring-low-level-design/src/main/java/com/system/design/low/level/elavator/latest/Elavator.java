package com.system.design.low.level.elavator.latest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elavator {
	private int counter = -1;
	private String liftname;
	private int currentfloor;
	private String direction;
	private List<Integer> listoffloors;
	public Elavator(String name) {
		super();
		this.liftname=name;
		this.listoffloors = new ArrayList<>();
		this.listoffloors = Collections.synchronizedList(this.listoffloors);
		//this.listoffloors = listoffloors;
		this.currentfloor=0;
		this.direction="UP";
	}
	
	
	public int getCurrentfloor() {
		return currentfloor;
	}


	public void setCurrentfloor(int currentfloor) {
		this.currentfloor = currentfloor;
	}


	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public String getLiftname() {
		return liftname;
	}


	public void setLiftname(String liftname) {
		this.liftname = liftname;
	}


	public void addFloors(int i)
	{
		this.listoffloors.add(i);
	}
	public boolean searchFloor(int i)
	{
		return this.listoffloors.contains(i) ? false : true;
	}
	public void deleteFloor(int i)
	{
		this.listoffloors.remove(i);
	}
	
	public int getPassangerListSize()
	{
		return this.listoffloors.size();
	}
	public int counter()
	{
		int operater=1;
		if(counter < 0)
		{	
			counter=0;
		}	
		currentfloor= currentfloor+operater;
		
		if(currentfloor == 10)
		{	
			direction="DOWN";
			operater=-1;
		}
		else if(currentfloor == 0)
		{
			direction="UP";
			operater=1;
		}
		return currentfloor;
	}

}


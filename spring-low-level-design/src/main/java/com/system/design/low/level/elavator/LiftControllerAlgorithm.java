package com.system.design.low.level.elavator;

import java.util.List;

public class LiftControllerAlgorithm {
	
	List<Lift> listofLifts;
	List<Floor> listoffloors;
	public LiftControllerAlgorithm(List<Lift> listofLifts, List<Floor> listoffloors) {
		super();
		this.listofLifts = listofLifts;
		this.listoffloors = listoffloors;
	}
	
	public void getProbability(int floorno,String position)
	{
		int mintraverse=Integer.MAX_VALUE;
		Lift minlift;
		int traverse=0;
		for(Lift l : listofLifts)
		{
			int currentfloor=l.currentfloor;
			String state=l.state;
			if(state.equals(position))
			{
				traverse = floorno-currentfloor;
				if(traverse < 0)
				{
					traverse = (listoffloors.size() - currentfloor) + (listoffloors.size() - floorno);
				}	
			}
			else if(state.equals("up"))
			{
				traverse = (listoffloors.size() - currentfloor) + (listoffloors.size() - floorno);
			}
			else
			{
				traverse = (currentfloor + floorno);
			}
			
			if(mintraverse > traverse)
			{
				mintraverse=traverse;
				minlift = l;
			}
		}	
	}
	
	

}

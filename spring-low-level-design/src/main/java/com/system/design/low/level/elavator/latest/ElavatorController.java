package com.system.design.low.level.elavator.latest;

import java.util.List;

public class ElavatorController {
	private static int nooffloor;
	private List<Elavator> elavatorlist;
	public ElavatorController(int nooffloor, List<Elavator> elavatorlist) {
		super();
		this.nooffloor = nooffloor;
		this.elavatorlist = elavatorlist;
	}
	public void passangerRequest(int destinationfloor,String direction,Elavator lift)
	{
		if(lift == null)
			lift=stretagyCalculator(destinationfloor,direction);
		lift.addFloors(destinationfloor);
		
	}
	public static int getNoOfFloor()
	{
		return nooffloor;
	}
	
	public Elavator stretagyCalculator(int destinationfloor,String direction)
	{
		int mindestination=Integer.MAX_VALUE;
		Elavator maxelavator=null;
		for(Elavator el : elavatorlist)
		{
			int currentfloor = el.getCurrentfloor();
			String liftdir = el.getDirection();
			int traversefloor=Integer.MAX_VALUE;
			if(liftdir == "UP")
			{
				if((destinationfloor - currentfloor) < 0)
				{
					traversefloor=((this.nooffloor - currentfloor)+(this.nooffloor - destinationfloor));
				}
				else
				{
					traversefloor=destinationfloor - currentfloor;
				}	
			}
			else
			{
				if((currentfloor - destinationfloor) < 0)
				{
					traversefloor=(currentfloor+destinationfloor);
				}
				else
				{
					traversefloor=currentfloor-destinationfloor;
				}
				
			}	
			if(mindestination > traversefloor)
			{
				mindestination=traversefloor;
				maxelavator=el;
				
			}	
		}
		return maxelavator;
	}
	public boolean elavatorProcessor()
	{
		int flr = -1;
		boolean flg=false;
		for(Elavator el : elavatorlist)
		{
			if(el.getPassangerListSize() > 0)
			{	
				flr=el.counter();
				if(el.searchFloor(flr))
				{	
					System.out.println("Lift : "+el.getLiftname()+" is in "+flr);
					el.deleteFloor(flr);
				}	
				flg=true;
			}	
		}	
		return flg;
	}

}

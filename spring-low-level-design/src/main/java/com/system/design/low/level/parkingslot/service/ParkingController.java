package com.system.design.low.level.parkingslot.service;

import java.time.Instant;
import java.util.List;

public class ParkingController {
	List<ParkingFloor> pflist;
	
	public ParkingController(List<ParkingFloor> pflist) {
		super();
		this.pflist = pflist;
	}
	public ParkingTicket ParkVechicle(Vehicle v)
	{
		Instant start = Instant.now();
		ParkingTicket pt = null;
		for(ParkingFloor pf : pflist)
		{
			if(pf.isSlotAvailable(v.vehicletype))
			{	
				//pf.booktheSlot(v);
				pt = new ParkingTicket(pf.booktheSlot(v),start);
				break;
			}
		}
		return pt;
		
	}
	
	public int releaseReservation(ParkingTicket pt)
	{
		Instant start = pt.getStartTime();
		Instant end = start.plusSeconds(2*60*60);
		int timediff = (int)Math.ceil((double)((end.getEpochSecond() - start.getEpochSecond())/60)/60);
		int priceperhour = pt.getPs().getVehicle().getPrice();
		int totalprice = priceperhour*timediff;
		
		pt.getPs().getParkingfloor().releaseBooking(pt.getPs());
		return totalprice;
		
	}
	
	public void printAvailableSlotsInFloors()
	{
		for(ParkingFloor pf : pflist)
		{
			pf.printAvailableSlot();
		}
	}

}

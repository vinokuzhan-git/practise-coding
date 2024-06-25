package com.system.design.low.level.parkingslot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ParkingFloor {
	
	private int floornumber;
	//private int noofparkingslot;
	private HashMap<String,Boolean> vehicleavailability  = new HashMap<>();
	private HashMap<String,BlockingQueue<ParkingSlot>> hm  = new HashMap<>();
	
	
	public ParkingFloor(int floornumber) {
		super();
		this.floornumber = floornumber;
	}


	public void configureVehicleSlot(String vehicleType, int noofparkingslot)
	{
		//List<ParkingSlot> parkingSlot = new ArrayList<>();
		
		BlockingQueue<ParkingSlot> parkingSlot = new LinkedBlockingQueue<>();
		
		for(int i=1;i<=noofparkingslot;i++)
			parkingSlot.add(new ParkingSlot(this,floornumber+"-"+vehicleType+"-"+1));
		
		hm.put(vehicleType, parkingSlot);
		vehicleavailability.put(vehicleType, true);
	}
	
	public boolean isSlotAvailable(String vehicletype)
	{
		return hm.get(vehicletype).peek() == null?false:true;
	}
	
	public ParkingSlot booktheSlot(Vehicle v)
	{
		BlockingQueue<ParkingSlot> pslist = hm.get(v.vehicletype);
		
		ParkingSlot ps = pslist.poll();
		ps.setVehicle(v);
		
		
		return ps;	
	}
	
	public void releaseBooking(ParkingSlot ps)
	{
		BlockingQueue<ParkingSlot> pslist = hm.get(ps.getVehicle().vehicletype);
		ParkingSlot releasedps = ps;
		releasedps.setVehicle(null);
		pslist.add(releasedps);
	}
	
	public void printAvailableSlot()
	{
		//List<ParkingSlot> parkingSlot = new ArrayList<>();
		
		 for (Entry<String, BlockingQueue<ParkingSlot>> entry : hm.entrySet()) {
			 System.out.println("Floor : "+this.floornumber+" VehicleType : "+entry.getKey()+" : Available slots : "+entry.getValue().size());
		 }
	}

	
}

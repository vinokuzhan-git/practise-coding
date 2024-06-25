package com.system.design.low.level.parkingslot;

import java.util.ArrayList;
import java.util.List;

import com.system.design.low.level.parkingslot.service.ParkingController;
import com.system.design.low.level.parkingslot.service.ParkingFloor;
import com.system.design.low.level.parkingslot.service.ParkingTicket;
import com.system.design.low.level.parkingslot.service.Vehicle;

public class ParkingSlotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nooffloors=2;
		ParkingFloor f;
		List<ParkingFloor> pflist = new ArrayList<>();
		for(int i=1;i<=nooffloors;i++)
		{
			f = new ParkingFloor(i);
			f.configureVehicleSlot("Bike", 10);
			f.configureVehicleSlot("Car", 5);
			f.configureVehicleSlot("Heav", 10);
			pflist.add(f);
		}	
		
		Vehicle v1 = new Vehicle("TN61R5676","Car");
		ParkingController pc = new ParkingController(pflist);
		pc.printAvailableSlotsInFloors();
		
		System.out.println("Parking the car : ");
		System.out.println();
		
		ParkingTicket pt = pc.ParkVechicle(v1);
		
		System.out.println("TicketNumber : "+pt.getTicketnumber());
		
		pc.printAvailableSlotsInFloors();
		
		System.out.println("Releasing the car : ");
		System.out.println();
		
		pc.releaseReservation(pt);
		
		pc.printAvailableSlotsInFloors();

	}

}

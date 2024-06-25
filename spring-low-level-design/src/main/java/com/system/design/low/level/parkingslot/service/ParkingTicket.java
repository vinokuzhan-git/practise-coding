package com.system.design.low.level.parkingslot.service;

import java.time.Instant;
import java.util.UUID;

public class ParkingTicket {
	
	private Vehicle vehicle;
	private ParkingSlot ps;
	private Instant startTime;
	private Instant endTime;
	private String ticketnumber;
	
	public ParkingTicket(ParkingSlot ps, Instant startTime) {
		super();
		this.ps = ps;
		this.startTime = startTime;
		UUID uuid = UUID.randomUUID();
        this.ticketnumber = uuid.toString();
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ParkingSlot getPs() {
		return ps;
	}

	public void setPs(ParkingSlot ps) {
		this.ps = ps;
	}

	public Instant getStartTime() {
		return startTime;
	}

	public void setStartTime(Instant startTime) {
		this.startTime = startTime;
	}

	public Instant getEndTime() {
		return endTime;
	}

	public void setEndTime(Instant endTime) {
		this.endTime = endTime;
	}

	public String getTicketnumber() {
		return ticketnumber;
	}
	
	
	
	
	
	

}

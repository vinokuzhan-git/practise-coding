package com.system.design.low.level.parkingslot.service;

public class ParkingSlot {
	private String slotId;
	private Vehicle vehicle;
	private boolean isAvailable;
	private ParkingFloor parkingfloor;
	public ParkingSlot(ParkingFloor parkingfloor,String slotId) {
		super();
		this.slotId = slotId;
		this.parkingfloor = parkingfloor;
	}
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public ParkingFloor getParkingfloor() {
		return parkingfloor;
	}
	public void setParkingfloor(ParkingFloor parkingfloor) {
		this.parkingfloor = parkingfloor;
	}
	
	
	
	
	
	
}

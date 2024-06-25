package com.system.design.low.level.elavator;

public class Button {
	int currentfloor;
	int destinationfloor;
	boolean isMovingUp;
	public Button(int currentfloor, int destinationfloor, boolean isMovingUp) {
		super();
		this.currentfloor = currentfloor;
		this.destinationfloor = destinationfloor;
		this.isMovingUp = isMovingUp;
	}
	public int getCurrentfloor() {
		return currentfloor;
	}
	public void setCurrentfloor(int currentfloor) {
		this.currentfloor = currentfloor;
	}
	public int getDestinationfloor() {
		return destinationfloor;
	}
	public void setDestinationfloor(int destinationfloor) {
		this.destinationfloor = destinationfloor;
	}
	public boolean isMovingUp() {
		return isMovingUp;
	}
	public void setMovingUp(boolean isMovingUp) {
		this.isMovingUp = isMovingUp;
	}
	

}

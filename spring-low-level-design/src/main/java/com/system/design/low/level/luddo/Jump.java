package com.system.design.low.level.luddo;

public class Jump {

	int current;
	int destination;
	String type;
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Jump(int current, int destination, String type) {
		super();
		this.current = current;
		this.destination = destination;
		this.type = type;
	}
}

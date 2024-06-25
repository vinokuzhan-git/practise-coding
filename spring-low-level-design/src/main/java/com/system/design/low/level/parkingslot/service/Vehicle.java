package com.system.design.low.level.parkingslot.service;

public class Vehicle {
		String vehiclenumber;
		String vehicletype;
		public Vehicle(String vehiclenumber, String vehicletype) {
			super();
			this.vehiclenumber = vehiclenumber;
			this.vehicletype = vehicletype;
		}
		public int getPrice()
		{
			switch(vehicletype)
			{
			case "Bike":
				return 20;
			case "car":
				return 50;
			case "Bus":
				return 100;
			}
			return 0;
		}
}

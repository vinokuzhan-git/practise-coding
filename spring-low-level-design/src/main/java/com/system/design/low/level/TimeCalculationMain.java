package com.system.design.low.level;

import java.sql.Timestamp;
import java.time.Instant;

public class TimeCalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant start = Instant.now();
		System.out.println("The time right now (local time): " + start.getEpochSecond());
		
		Instant end = start.plusSeconds(2*60*60);
		System.out.println("The time right now (local time): " + end.getEpochSecond());
		System.out.println((((end.getEpochSecond() - start.getEpochSecond())/60)/60));

	}

}

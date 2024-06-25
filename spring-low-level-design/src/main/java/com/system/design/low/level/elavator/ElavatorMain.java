package com.system.design.low.level.elavator;

import java.util.ArrayList;
import java.util.List;

public class ElavatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Lift> listoflift = new ArrayList<>();
		listoflift.add(new Lift("A"));
		listoflift.add(new Lift("B"));
		listoflift.add(new Lift("C"));
		
		List<Floor> listoffloors = new ArrayList<>();
		
		listoffloors.add(new Floor(0));
		listoffloors.add(new Floor(1));
		listoffloors.add(new Floor(2));
		listoffloors.add(new Floor(3));
		listoffloors.add(new Floor(4));
		listoffloors.add(new Floor(5));
		listoffloors.add(new Floor(6));
		listoffloors.add(new Floor(7));
		listoffloors.add(new Floor(8));
		listoffloors.add(new Floor(9));
		listoffloors.add(new Floor(10));
		

	}

}

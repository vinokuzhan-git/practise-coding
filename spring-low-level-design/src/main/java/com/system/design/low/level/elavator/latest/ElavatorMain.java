package com.system.design.low.level.elavator.latest;

import java.util.ArrayList;
import java.util.List;

public class ElavatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Elavator> elavatorlist = new ArrayList<>();
		
		//Elavator l1 = new Elavator("L1");
		elavatorlist.add(new Elavator("L1"));
		elavatorlist.add(new Elavator("L2"));
		elavatorlist.add(new Elavator("L3"));
		
		ElavatorController elvc = new ElavatorController(10,elavatorlist);
		elvc.passangerRequest(1, "UP", null);
		elvc.passangerRequest(5, "UP", null);
		elvc.passangerRequest(8, "DOWN", null);
		
	//	elvc.passangerRequest(10, null, null);
	//	elvc.passangerRequest(7, null, null);
	//	elvc.passangerRequest(2, null, null);
		boolean flg=true;
		while(flg)
			flg=elvc.elavatorProcessor();

	}

}

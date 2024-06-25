package com.example.demo.serivice.impl;

import com.example.demo.serivice.NetworkService;

public class UnlimitedCalls implements NetworkService {

	@Override
	public void serviceActivator() {
		System.out.println("UnlimitedCalls is Activated !!");
		
	}

}

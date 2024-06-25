package com.demo.java.staticnonstatic;

public class Student {
	String name;
	int id;
	public static int noofStundets=0;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		++noofStundets;
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getNoofStundets() {
		return noofStundets;
	}

}

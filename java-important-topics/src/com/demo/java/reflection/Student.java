package com.demo.java.reflection;

public class Student {
	
	public Student(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	private int id;
	private String name;
	private String department;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void staticMethod(int a, int b) {
		System.out.println("This is static Method call !!");
	}

}

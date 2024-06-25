package com.demo.java.staticnonstatic;

public class StaticMain {
	public static void main(String[] args) {
		
		// Non-static type cannot be referred inside static type. It will throw Error.
		// Static type can be referred inside the non-static type. It will throw warning
		
		System.out.println("Student count : "+Student.getNoofStundets());
		
		Student s1 = new Student("Vinoth",100);
		System.out.println("ID : "+s1.getId()+" Name : "+s1.getName());
		
		Student s2 = new Student("Mukilan",101);
		System.out.println("ID : "+s2.getId()+" Name : "+s2.getName());
		
		Student s3 = new Student("Kuzhan",102);
		System.out.println("ID : "+s3.getId()+" Name : "+s3.getName());
		
		System.out.println("Student count : "+Student.getNoofStundets());
	}

}

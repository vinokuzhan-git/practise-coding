package com.demo.java.innerclass;

public class OuterClass {
	
	String StudentName;
	int id;
	public static String statStudentName;
	public static int staticId;
	public OuterClass(String studentName, int id) {
		super();
		StudentName = studentName;
		this.id = id;
		this.statStudentName = studentName;
		this.staticId = id;
	}
	
	public void print()
	{
		System.out.println(id +" : "+StudentName);
	}
	
	public static void printStatic()
	{
		try {
			System.out.println("Static : "+staticId +" : "+statStudentName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public class Subject
	{
		String name;
		int mark;
		public static String staticname;
		public static int staticma;
		public Subject(String name, int mark) {
			super();
			this.name = name;
			this.mark = mark;
			this.staticname = name;
			this.staticma = mark;
		}
		
		public void print()
		{
			System.out.println(name +" : "+mark);
		}
		
		public static void printStatic()
		{
			System.out.println("Static : "+staticname +" : "+staticma);
		}
		
		
		
	}
	

}

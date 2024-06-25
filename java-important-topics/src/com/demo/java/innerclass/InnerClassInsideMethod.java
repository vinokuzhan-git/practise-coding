package com.demo.java.innerclass;

public class InnerClassInsideMethod {
	
	int departmentid;
	String departmentname;
	public InnerClassInsideMethod(int departmentid, String departmentname) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}
	public void print()
	{
		System.out.println(departmentid+" : "+departmentname);
		
		class NoOfStudent
		{
			String name = "Vinoth";
			
			public void print()
			{
				System.out.println("StudentName : "+name);
			}
		}
		NoOfStudent stu = new NoOfStudent();
		stu.print();
	}

}

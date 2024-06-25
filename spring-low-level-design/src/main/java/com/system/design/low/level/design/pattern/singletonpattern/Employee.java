package com.system.design.low.level.design.pattern.singletonpattern;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {
	
	private volatile static Employee employee;
	private volatile String name = "Vinoth"; 
	private volatile int id; 
	
	private Employee()
	{}
	public static Employee getInstance()
	{
		System.out.println("Employee Get Instance !!");
		if(employee == null)
		{
			synchronized(Employee.class)
			{
				if(employee == null)
				{
					System.out.println("Employee Create Instance !!");
					employee = new Employee();
				}
				
			}
		}	
		return employee;
			
	}

	public String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public synchronized void setId(int id) {
		this.id = id;
	}
	protected Object readReslove()
	{
		return employee;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}


}

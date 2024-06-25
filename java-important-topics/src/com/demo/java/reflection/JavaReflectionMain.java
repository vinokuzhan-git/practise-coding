package com.demo.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class JavaReflectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Reflection started !!");
		
		Student s = new Student(100,"Kuzhanthaiyan","CSE");
		
		Method[] methods = s.getClass().getDeclaredMethods();
		Field[] feilds=s.getClass().getDeclaredFields();
		
		for(Field f : feilds)
		{
			if (f.getName().equalsIgnoreCase("name"))
			{
				try {
					f.setAccessible(true);
					f.set(s, "Vinokuzhan");
					System.out.println("Print Feild value : "+s.toString());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		for(Method m : methods)
		{
			if(m.getName().equalsIgnoreCase("getName"))
			{
				System.out.println("GetName method found !!");
				try {
					m.setAccessible(true);
					System.out.println(m.invoke(s));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(m.getName().equalsIgnoreCase("add"))
			{
				System.out.println("add method found !!");
				try {
					// m.setAccessible(true);
					System.out.println(m.invoke(s,5,7));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(m.getName().equalsIgnoreCase("staticMethod"))
			{
				System.out.println("staticMethod method found !!");
				try {
					// m.setAccessible(true); Static method call
					m.invoke(null,5,6);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}

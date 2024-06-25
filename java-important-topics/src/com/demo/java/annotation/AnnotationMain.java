package com.demo.java.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationMain {
	
	public static void main(String[] args) {
		
		//MathematicsOperations mo = new MathematicsOperations(10,23,4);
		MathematicsOperations mo = new MathematicsOperations(10,23,4,"Vinoth");
		
		Method[] methods = mo.getClass().getDeclaredMethods();
		
		Field[] feilds = mo.getClass().getDeclaredFields();
		
		for(Method method : methods)
		{
			if(method.isAnnotationPresent(ExecuteAnnotation.class))
			{
				try {
					System.out.println(method.invoke(mo));
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
		
		for(Field field : feilds)
		{
			if(field.isAnnotationPresent(RequiredFeild.class))
			{
				try {
					if(field.getName().equalsIgnoreCase("valued"))
					if(field.get(mo) != null)
					System.out.println("field : "+field.getName()+" Is Not NULL");
					else
						System.out.println("field : "+field.getName()+" Is NULL");	
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}

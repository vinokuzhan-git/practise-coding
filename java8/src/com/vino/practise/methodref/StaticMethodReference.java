package com.vino.practise.methodref;

interface MethodRef
{
	void test(String name);
}

public class StaticMethodReference {
	
	public static void print1(String name)
	{
		System.out.println("Hi "+name);
	}
	
	public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
	
	public static void main(String[] args) {
		MethodRef mr = StaticMethodReference::print1;
		mr.test("Vinoth");
		
	    Thread t = new Thread(StaticMethodReference::ThreadStatus);
	    
	    t.start();
	
}
}

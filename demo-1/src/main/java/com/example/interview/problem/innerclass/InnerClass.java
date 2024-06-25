package com.example.interview.problem.innerclass;

class A
{
	class B
	{
		public void printB()
		{
			System.out.println("Inside B Class");
		}
		public static void printStaticB()
		{
			System.out.println("Inside B static Class");
		}
	}
	
	static class C
	{
		public void printC()
		{
			System.out.println("Inside C Class");
		}
		public static void printStaticC()
		{
			System.out.println("Inside C static Class");
		}
	}
	
	

	public void print()
	{
		System.out.println("Inside A Class");
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.print();
		A.B b = a.new B(); // Non-static way of calling inner class method.
		
		b.printB();
		// A.B bstatic = a.new B();
		b.printStaticB();
		A.B.printStaticB();
		A.C c = new A.C();   // static inner class object 
		c.printC();
		c.printStaticC();
		c.printC();
		c.printStaticC();
		A.C.printStaticC();
	}

}

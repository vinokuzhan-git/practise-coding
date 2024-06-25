package com.demo.java.innerclass;

public class InnerClassMain {
	
	public static void main(String[] args) {
		
		normalCall();
		staticCall();
		innerClass();
		
	}	
	
	private static void staticCall() {
		
		System.out.println("Print Static Objects :");
		 OuterClass outer = new OuterClass("Vinoth",100);
			
		 OuterClass.printStatic();
		 
		 OuterClass.Subject.printStatic();
			
			//subject.print();
		
	}

	public static void normalCall()
	{
		System.out.println("Print Normal Objects :");
        OuterClass outer = new OuterClass("Vinoth",100);
		
		outer.print();
		
		OuterClass.Subject subject = outer.new Subject("Science", 98);
		
		subject.print();
	}
	
	public static void innerClass()
	{
		System.out.println("Print innerClass Objects :");
		InnerClassInsideMethod inner = new InnerClassInsideMethod(100,"CSE");
		
		inner.print();
	}

}

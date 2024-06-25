package com.demo.java.annotation;

public class MathematicsOperations {
	
	int valuea;
	int valueb;
	int valuec;
	
	@RequiredFeild 
	String valued;
	public MathematicsOperations(int valuea, int valueb, int valuec, String valued) {
		super();
		this.valuea = valuea;
		this.valueb = valueb;
		this.valuec = valuec;
		this.valued = valued;
	}

	public MathematicsOperations(int valuea, int valueb, int valuec) {
		super();
		this.valuea = valuea;
		this.valueb = valueb;
		this.valuec = valuec;
	}
	
	public int add()
	{
		System.out.println("This is Addition Method !!");
		return valuea+valueb;
	}
	
	@ExecuteAnnotation
	public int sub()
	{
		System.out.println("This is Subraction Method !!");
		return valuea-valueb;
	}
	
	@ExecuteAnnotation
	public int multiply()
	{
		System.out.println("This is Mutiply Method !!");
		return valuea*valueb*valuec;
	}

}

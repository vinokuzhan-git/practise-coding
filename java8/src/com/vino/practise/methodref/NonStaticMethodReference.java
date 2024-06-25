package com.vino.practise.methodref;

interface Arithmatic
{
	int add1(int a,int b);
}

public class NonStaticMethodReference {
	int addition (int a,int b)
	{
		//System.out.println("Total : "+a + b);
		return a+b;
	}
	
	public static void main(String[] args) {
		NonStaticMethodReference nsm = new NonStaticMethodReference();
		Arithmatic arthmatic = nsm::addition;
		//arthmatic.add(10,20);
		int c = arthmatic.add1(10, 40);
		System.out.println("Final Total : "+c);
	}
	
	
	

}

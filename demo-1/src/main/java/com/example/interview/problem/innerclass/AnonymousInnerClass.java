package com.example.interview.problem.innerclass;

abstract class AnonymousInnerClassA
{
	public abstract void print();
	// public static abstract void staticMethod();
	public void show()
	{
		System.out.println("Abstract show method is called !!");
	}
	public void config()
	{
		System.out.println("Abstract config method is called !!");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousInnerClassA a = new AnonymousInnerClassA()
		{
			public void config()
			{
				System.out.println("Abstract Anonymous innerclass config method is called !!");
			}
			public void print()
			{
				System.out.println("Abstract inner class !!");
			}
		};
		a.show();
		a.print();
		a.config();

	}

}

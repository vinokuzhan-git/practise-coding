package com.example.interview.problem;


class A
{
	public void show()
	{
		System.out.println("In A Ashow()");
	}
	private void print()
	{
		System.out.println("In A Ashow()");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("In B Ashow()");
		//print();
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		a.show();

	}

}

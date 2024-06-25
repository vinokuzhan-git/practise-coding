package com.vino.practise.methodref;

interface ConstructorInteface
{
	void getMessage(String name);
}

public class ConstructorMethodReference {
	ConstructorMethodReference(String name)
	{
		System.out.println("Hi "+name);
	}
	
	public static void main(String[] args) {
		ConstructorInteface ci = ConstructorMethodReference::new;
		ci.getMessage("Kuzhanthaiyan");
	}

}

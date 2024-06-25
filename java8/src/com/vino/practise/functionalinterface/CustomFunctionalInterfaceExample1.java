package com.vino.practise.functionalinterface;

interface CustomIface
{
	void printInput(String a);
}

interface CustomIfaceMultipleValues
{
	void printInput(Integer a,Integer b,Integer c,Integer d,Integer e);
}

public class CustomFunctionalInterfaceExample1 {
	
	public static void main(String[] args) {
		
		// CustomIface
		// Print the input using Lambda Expression {}
		CustomIface custom = (a) -> {
			System.out.println("Output : "+a);
		};
		custom.printInput("Vinoth");
		
		// Print the input using Lambda Expression Without {}
		
		CustomIface custom1 = (a) -> System.out.println("Output2 : "+a);
		custom1.printInput("Vinoth2");
		
		CustomIface custom3 = System.out::println;
		custom3.printInput("Vinoth3");
	}

}

package com.vino.practise.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class PredefineFunctionalInterface {
	public static void main(String[] args) {
		
		String a="vmware";
		
		// Function
		Function<String,String> f= (a1) -> a1.toUpperCase();
		
		System.out.println("f : "+f.apply(a));
		
		// BiFunction
		
		int b = 10;
		int c = 15;
		
		BiFunction<Integer,Integer,Integer> bf = (p1,p2) -> p1*p2;
		System.out.println("bf : "+bf.apply(b,c));
		
		Consumer<Integer> consumer = (p1) ->  System.out.println(p1 * p1);
		
		consumer.accept(100);
		
		
		
	}

}

package com.vino.practise.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterUsingStream {
	
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		marks.add(100);
		marks.add(95);
		marks.add(73);
		marks.add(88);
		marks.add(63);
		
	/*	Stream.of(marks)
        .filter(x -> x % 2 == 0)
        .forEach(System.out::println); */
		marks.stream().filter(mark -> mark % 2 == 0).forEach(System.out::println);
		result = marks.stream().filter(mark -> mark % 2 == 0).collect(Collectors. toList());
		System.out.println("Final Result : "+result);
		
		result = marks.stream().filter(mark -> mark > 80).collect(Collectors. toList());
		System.out.println("Mark greater than 80 : "+result);
	}

}

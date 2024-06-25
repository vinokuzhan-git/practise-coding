package com.youtube.problem.string;

public class RemoveVowelsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vowels = {"a","e","i","o","u"};
		String str="what is your name";
		
		for(String s : vowels)
			str=str.replaceAll(s, "");
		
		System.out.println("str : "+str);

	}

}

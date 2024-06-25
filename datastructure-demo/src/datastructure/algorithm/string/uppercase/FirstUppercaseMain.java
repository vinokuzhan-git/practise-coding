package datastructure.algorithm.string.uppercase;

import java.util.Arrays;

public class FirstUppercaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUppercase fu = new FirstUppercase();
		char c = fu.findFirstUppercase("appmilKlerS");
		char[] a = {'c','b','a'};
		//Arrays.sort(a);
		//System.out.println(a.toString());
		/*for(char i:a)
			System.out.print(i); */
		System.out.println("c : "+c);
	}

}

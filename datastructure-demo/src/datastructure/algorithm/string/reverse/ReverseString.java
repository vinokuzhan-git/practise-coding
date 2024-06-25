package datastructure.algorithm.string.reverse;

public class ReverseString {
	
	String temp = "";
	public String reverse(String s)
	{
		//System.out.println("S : "+s+" Length : "+s.length());
		if(s.length() == 0)
			return "";
		temp = temp + s.charAt(s.length()-1);
		//System.out.println("Temp : "+temp);
		reverse(s.substring(0, s.length()-1));
		return temp;
		
	}

}

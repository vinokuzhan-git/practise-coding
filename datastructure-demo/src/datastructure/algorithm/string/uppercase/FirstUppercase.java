package datastructure.algorithm.string.uppercase;

public class FirstUppercase {
	
	int index=0;
	
	public char findFirstUppercase(String s)
	{
		if(s.length() == index)
			return '0';
		
		if(Character.isUpperCase(s.charAt(index)))
			return s.charAt(index);
		else
		{
			index++;
			return findFirstUppercase(s);
		}
	}

}

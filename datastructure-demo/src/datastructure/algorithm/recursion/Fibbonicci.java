package datastructure.algorithm.recursion;

public class Fibbonicci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibb(5);
		

	}
	
	public static int fibb(int n)
	{
		
		if (n<0)
			return n;
		else if((n==0) || (n==1))
		{
			return n;
		}
		System.out.println(n);
		return fibb(n-1)+fibb(n-2);
	}

}

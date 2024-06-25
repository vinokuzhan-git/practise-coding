package datastructure.algorithm.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=binaryConversion(27);
		System.out.println("result : "+r);
	}
	
	public static int binaryConversion(int n)
	{
		if(n <= 0)
		{
			return 0;
		}	
		int r = n%2;
		n=n/2;
		
		//System.out.println("r : "+r);
		//System.out.println("n : "+n);
		return r+(binaryConversion(n)*10);
	}

}

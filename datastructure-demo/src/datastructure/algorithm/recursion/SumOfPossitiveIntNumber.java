package datastructure.algorithm.recursion;

public class SumOfPossitiveIntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = splitdigit(99999,0);
		System.out.println("Result : "+result);
	}
	
	public static int splitdigit(int n,int sum)
	{
		System.out.println("n : "+n);
		System.out.println("sum : "+sum);
		if(n <= 0)
			return sum;
		
		sum = sum + (n%10);
		n= n/10;
		sum = splitdigit(n,sum);
		return sum;
	}

}

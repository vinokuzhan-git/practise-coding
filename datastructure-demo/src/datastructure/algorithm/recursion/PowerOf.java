package datastructure.algorithm.recursion;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = power(9,9);
		System.out.println(result);
	}
	
	public static int power(int base, int p)
	{
		if(p == 0)
			return 1;
		return base * power(base, p-1);
	}

}

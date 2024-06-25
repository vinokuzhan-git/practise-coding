package datastructure.algorithm.odd.array;

public class SomeRecursiveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SomeRecursive sr = new SomeRecursive();
		int[] i = {4,6,8,9,2};
		boolean flg = sr.recursive(i,0);
		
		System.out.println("flg : "+flg);
	}

}

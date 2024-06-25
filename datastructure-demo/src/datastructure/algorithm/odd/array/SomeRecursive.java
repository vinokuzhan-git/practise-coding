package datastructure.algorithm.odd.array;

public class SomeRecursive {
	
	public boolean recursive(int[] i, int index)
	{
		if(index >= i.length)
			return false;
		System.out.println("i[] : "+i[index]+" index : "+index);
		if((i[index]%2) > 0)
			return true;
		else
			return recursive(i, index+1);	
		
	}

}

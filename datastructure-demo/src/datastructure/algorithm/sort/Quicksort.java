package datastructure.algorithm.sort;

public class Quicksort {
	
	public static void main(String[] args) {
		int array[] = {2, 4, 1, 100, 8, 7, 9, 6, 5};
		int start=0;
		int end=array.length-1;
		quicksortalg(array,start,end);
		for(int i:array)
		{
			System.out.print(i);
		}
		
	}

	private static void quicksortalg(int array[], int start, int end) {
		if((end-start) < 1)
		{
			return;
		}
		int i=start-1;
		int j=start;
		int pivot=end;
		
		while(j <= end)
		{
			if(array[pivot] >= array[j])
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			j++;
		}
	/*	System.out.println("inner Array : ");
		for(int arr:array)
		{
			System.out.print(arr);
		}
		System.out.println(""); */
		pivot=i;
		quicksortalg(array,start,pivot-1);  //left element
		quicksortalg(array,pivot+1,end);  //right element
		
	}
	
	

}

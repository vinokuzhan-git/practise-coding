package datastructure.algorithm.search.binary;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,8,9};
		int len = arr.length;
		//int mid = (int) Math.cile(len/2);
		int val = binarrySearchAlg(arr,0,len,8);
		System.out.println("val : "+val);
	}
	public static int binarrySearchAlg(int[] arr, int start,int end,int s)
	{
		if(start >= end)
			return 0;
		int len = end-start;
		//int mid = (int) Math.ceil(len/2);
		int mid = len/2;
		mid= mid+start;
		System.out.println("start : "+start);
		System.out.println("end : "+end);
		System.out.println("mid : "+mid);
		if(s == arr[mid])
			return mid;
		else if(s < arr[mid])
			return binarrySearchAlg(arr,start,mid,s);
		else if(s > arr[mid])
			return binarrySearchAlg(arr,mid+1,end-1,s);
		return mid;
	}
}

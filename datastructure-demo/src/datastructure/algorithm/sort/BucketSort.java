package datastructure.algorithm.sort;

import java.util.ArrayList;

public class BucketSort {

	public static void main(String[] args) {
		int[] sortarr = {5,2,7,5,7,2,8,4,9,4,6,3,1};
		bucketSort(sortarr);
		

	}
	
	public static void bucketSort(int[] sortarr)
	{
		int maxval=findMax(sortarr);
		int bucketcount=findNoOfBuckets(sortarr);
		
		ArrayList<Integer>[] buckets = new ArrayList[bucketcount];
		
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i] = new ArrayList<>();
		}
		
		for(int i=0;i<sortarr.length;i++)
		{
			int j=(int)Math.ceil((double)(sortarr[i]*bucketcount)/maxval)-1;
			System.out.println("i : "+i+" j : "+j);
			buckets[j].add(sortarr[i]);
		}
		int k=0;
		for(int i=0;i<buckets.length;i++)
		{
			
			buckets[i]=sortBucket(buckets[i]);
			for(int j=0;j<buckets[i].size();j++)
			{
				sortarr[k++]=buckets[i].get(j);
			}	
		}
		printArr(sortarr);
		
	}
	
	public static int findMax(int[] sortarr)
	{
		int maxval = 0;
		for(int i=0;i<sortarr.length;i++)
		{
			if(maxval < sortarr[i])
				maxval=sortarr[i];
		}
		return maxval;
	}
	
	public static int findNoOfBuckets(int[] sortarr)
	{
		int len=sortarr.length;
		
		return (int)Math.ceil(Math.sqrt(len));
		
	}
	public static ArrayList<Integer> sortBucket(ArrayList<Integer> bucket)
	{
		for(int i=0;i<bucket.size();i++)
		{
			for(int j=i+1;j<bucket.size();j++)
			{
				if(bucket.get(i) > bucket.get(j))
				{
					int temp = bucket.get(i);
					bucket.set(i,  bucket.get(j));
					bucket.set(j, temp);
				}	
			}	
		}	
		return bucket;
	}
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}

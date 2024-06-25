package datastructure.algorithm.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {8,5,9,1,6,7};
		int l=0;
        int r=arr.length-1;
        System.out.println("arr.length : "+arr.length+"r ="+r);
        mergeSort(arr,l,r);
        System.out.println("Final arr : "+Arrays.toString(arr)+"r ="+r);
        
	}
	
	public static void mergeSort(int[] arr, int l,int r)
	{
		System.out.println("Array : "+Arrays.toString(arr)+" l="+l+" r="+r);
		
		if(l == r)
			return;
		
		int mid= (l+r)/2;
		
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
	}
	
	public static void merge(int[] arr,int l,int mid, int r)
	{
		int temp=0;
		int indx =0;
		
		System.out.println("l="+l+" r="+r+" Array : ");
		for(int k=l;k<=r;k++)
		System.out.print(arr[k]);
		System.out.println();
		int[] larr = new int[(mid-l)+1];
		int[] rarr = new int[(r-mid)];
		
		for(int a=l;a<=mid;a++)
			larr[indx++] = arr[a];
		System.out.println("Array (larr) : "+Arrays.toString(larr)+" l="+l+" r="+r);
		indx=0;
		
		for(int a=mid+1;a<=r;a++)
			rarr[indx++] = arr[a];
		System.out.println("Array (rarr) : "+Arrays.toString(rarr)+" l="+l+" r="+r);
			
		int i=0, j=0, l1=l, mid1=mid+1, r1=r;
		
		while(i < larr.length && j<rarr.length)
		{
			if(larr[i] > rarr[j])
			{
				arr[l1++] = rarr[j];
				j++;
			}
			else
			{
				arr[l1++] = larr[i];
				i++;
			}
		}
		
		while(i < larr.length)
		{
			arr[l1++] = larr[i];
			i++;
		}	
		
		while(j < rarr.length)
		{
			arr[l1++] = rarr[j];
			j++;
		}
		
		System.out.println("Merger Array (arr) : "+Arrays.toString(arr)+" l="+l+" r="+r);

}
}

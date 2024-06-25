package com.youtube.problem.array;

public class SqureielArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[4][4];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		
		arr[2][0]=9;
		arr[2][1]=10;
		arr[2][2]=11;
		arr[2][3]=12;
		
		arr[3][0]=13;
		arr[3][1]=14;
		arr[3][2]=15;
		arr[3][3]=16;
		
		SqureielArray(arr);

	}
	
	public static void SqureielArray(int[][] arr)
	{
		int col=arr[0].length;
		int row=arr.length-1;
		int i=0; 
		int j=0;

		
		int scol=0;
		int srow=0;

	while(col > 0 && row > 0)
	{	
		while(scol++ < col)
		{
			System.out.println(arr[i][j++]);
		}	
		i++;
		j--;
		while(srow++ < row)
		{
			System.out.println(arr[i++][j]);
		}
		
		i--;
		j--;
		col--;
		scol=0;
		
		while(scol++ < col)
		{
			System.out.println(arr[i][j--]);
		}
		
		i--;
		j++;
		row--;
		srow=0;
		while(srow++ < row)
		{
			System.out.println(arr[i--][j]);
		}
		col--;
		row--;
		i++;
		j++;
		scol=0;
		srow=0;
	}
	}

}

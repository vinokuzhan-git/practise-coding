package com.youtube.problem.array;

public class IslandProblemMain {
	
	static int visitedcount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void IslandProblem(int[][] arr, boolean[][] visitedarr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				VisitIsland(arr, visitedarr,i,j);
			}	
		}	
	}

	
	public static void VisitIsland(int[][] arr, boolean[][] visitedarr,int row,int col)
	{
		if(((row >= 0) && (row < arr.length)) && ((col >= 0) && (col < arr[0].length)))
		{
			if((arr[row][col] > 0) && (!visitedarr[row][col]))
			{
				visitedarr[row][col]=true;
				visitedcount++;
				VisitIsland(arr, visitedarr,--row,col); // up
				VisitIsland(arr, visitedarr,++row,col); // down
				VisitIsland(arr, visitedarr,row,--col); // left
				VisitIsland(arr, visitedarr,row,++col); // left
			}	
		}
		else
			return;
	}
	
	
	
	

}

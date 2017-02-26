package Dynamic;

public class minCostPath {

	public static final int row=3;
	public static final int column=3;
	public static final int rlimit=2;
	public static final int climit=0;
	
	public static int min(int x,int y,int z)
	{
		if(x<y && x<z)
		{
			return x;
		}
		else if(y<x && y<z)
		{
			return y;
		}
		else
			return z;
	}
	
	public static int cost(int [][]arr,int i,int j)
	{
		if(i>rlimit || j>climit)
			return Integer.MAX_VALUE;
		else if(i==rlimit && j==climit)
			return arr[i][j];
		else
			return arr[i][j]+min(cost(arr,i+1,j),cost(arr,i,j+1),cost(arr,i+1,j+1));
		
	}
	public static int cost1(int [][]arr,int i,int j)
	{
		if(i<0 || j<0)
			return Integer.MAX_VALUE;
		else if(i==0 && j==0)
			return arr[i][j];
		else
			return arr[i][j]+min(cost1(arr,i-1,j),cost1(arr,i,j-1),cost1(arr,i-1,j-1));
	}
	
	public static void main(String[] args) {
		int[][] arr={{1,2,3},{4,8,2},{1,5,3}};
		//int[][] arr={{1,2},{4,8}};
		System.out.println(cost1(arr,2,0));
		System.out.println(cost(arr,0,0));
	}
}

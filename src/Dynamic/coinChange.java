package Dynamic;

public class coinChange {

	
	
	public static int count(int arr[],int sum)
	{
		int[][] arr1=new int[arr.length+1][sum+1];
		for(int i=1;i<arr.length+1;i++)
		{
		for(int j=arr[i-1];j<sum+1;j++)
		{
			if(j%arr[i-1]==0)
			{
				arr1[i][j]=j/arr[i-1];
			}
			else
			{
				arr1[i][j]=1+arr1[i][j-1];
			}
		}
		}
		return arr1[arr.length][sum];
	}
	public static void main(String args[])
	{
	    int i, j;
	    int arr[] = {1, 2, 3};
	    int l=arr.length;
	    int sum=4;
	    System.out.println(count(arr,4));
	}
}

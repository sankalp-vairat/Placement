package Dynamic;

import java.util.Scanner;

public class LIS1 {

	public static int lis(int []arr,int n)
	{
		int[] arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=1;
		}
		for(int i=(n-1);i>=0;i--)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j] && arr1[i]<(arr1[j]+1))
				{
					arr1[i]=arr1[j]+1;
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(max<arr1[i])
				max=arr1[i];
		}
		return max;
	}
	
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
            try{
                sc.nextLine();
            }
            catch(Exception e)
                {
                continue;
            }
        }
        int res=lis(arr, n);
        System.out.println(res);
	}
}

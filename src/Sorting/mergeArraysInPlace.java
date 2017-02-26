package Sorting;

public class mergeArraysInPlace {

	
	public static void merge(int a[],int b[])
	{
		int a_len=a.length-b.length;
		int b_len=b.length;
		int i=a_len-1;
		int j=b_len-1;
		int a_b_len=a.length-1;
		while(i>=0 && j >=0)
		{
			if(a[i]>b[j])
			{
				a[a_b_len]=a[i];
				i--;
				a_b_len--;
			}
			else
			{
				a[a_b_len]=b[j];
				j--;
				a_b_len--;
			}
		}
	}
	
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int c=5;
		int a[]={1,2,5,6,7,0,0,0,0,0};
		int b[]={3,4,8,9,10};
		
		merge(a,b);
		display(a);
	}
}

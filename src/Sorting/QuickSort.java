package Sorting;

public class QuickSort {

	public static void quickSort(int []arr,int lower,int higher)
	{
		int index=partition(arr,lower,higher);
		//if(lower>=0)
			
		
	}
	public static int partition(int arr[],int lower,int higher)
	{
		
		return 0;
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
	
		//int []arr={1,5,2,8,3,9};
		int arr[]={6,1,8,4,5,3,7,2};
		quickSort(arr,0,arr.length-1);
		display(arr);
	}
}

package Sorting;

public class SelectionSort {

	public static void sort(int arr[])
	{
		int min=0,j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			min=i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
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
	
		int []arr={1,5,2,8,3,9};
		sort(arr);
		display(arr);
	}
}

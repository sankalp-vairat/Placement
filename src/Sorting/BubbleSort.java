package Sorting;

public class BubbleSort {

	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	public static void modifiedSort(int []arr)
	{
		boolean swapped=true;
		for(int i=0;i<arr.length && swapped;i++)
		{
			swapped=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
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
		
		int []arr={1,5,2,8,3,9};
		sort(arr);
		display(arr);
		//-----------------------------------
		modifiedSort(arr);
		display(arr);
	}
}

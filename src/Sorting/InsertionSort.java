package Sorting;

public class InsertionSort {

	public static void sort(int[] arr)
	{
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			j=i;
			int temp=arr[i];
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];	
				j--;
				display(arr);
			}
			//if(j==-1)
				//j=0;
			arr[j]=temp;
			//System.out.println("---------------------------------");
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
		//int []arr={5,1,2,8,3,9};
		int arr[]={6,1,8,4,5,3,7,2};
		sort(arr);
		//display(arr);
	}
}
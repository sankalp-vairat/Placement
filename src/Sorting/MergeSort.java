package Sorting;

public class MergeSort {

	public static void mergeSort(int arr[],int lower,int higher)
	{
		if(lower<higher)
		{
			int mid=(lower+higher)/2;
			mergeSort(arr,lower,mid);
			mergeSort(arr,mid+1,higher);
			merge(arr,mid,lower,higher);
		}
	}
	
	public static void merge(int arr[],int mid,int lower,int higher)
	{
		int[] left=new int[mid-lower+1];
		int[] right=new int[higher-mid];
		int j=0;
		for(int i=lower;i<=mid;i++)
		{
			left[j]=arr[i];
			j++;
		}
		j=0;
		for(int i=mid+1;i<=higher;i++)
		{
			right[j]=arr[i];
			j++;
		}
		int i=0;
		j=0;
		int current=lower;
		while(i<left.length && j<right.length)
		{
		if(left[i]<right[j])
		{
			arr[current]=left[i];
			current++;
			i++;
		}
		else if(left[i]>right[j])
		{
			arr[current]=right[j];
			current++;
			j++;
		}
		}
		if(i<left.length)
		{
			while(i<left.length)
			{
				arr[current]=left[i];
				i++;
				current++;
			}
		}
		if(j<right.length)
		{
			while(j<right.length)
			{
				arr[current]=right[j];
				j++;
				current++;
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
	
		//int []arr={1,5,2,8,3,9};
		int arr[]={6,1,8,4,5,3,7,2};
		mergeSort(arr,0,arr.length-1);
		display(arr);
	}
	}

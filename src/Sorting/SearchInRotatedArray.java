package Sorting;

public class SearchInRotatedArray {
	
	public static int search(int arr[],int low,int high,int no)
	{
		if(high>=low)
		{
		int mid=(low+high)/2;
		if(arr[low]==no)
			return low;
		if(arr[high]==no)
			return high;
		if(no==arr[mid])
			return mid;
		if(no<arr[mid] && no>arr[low])
			return search(arr,low,mid,no);
		else if(no<arr[mid] && no<arr[low])
			return search(arr,mid+1,high,no);
		if(no>arr[mid] && (no<arr[high]))
			return search(arr,mid+1,high,no);
		else if(no>arr[mid] && (no>arr[high]))
			return search(arr,low,mid,no);
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[]={15,16,19,20,25,1,3,4,5,7,10,14};
		System.out.println(search(arr,0,arr.length-1,20));
	}
}
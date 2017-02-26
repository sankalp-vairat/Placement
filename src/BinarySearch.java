
public class BinarySearch {

	public int BinarySearch(int[] arr,int lower,int higher,int n)
	{
		if (higher>=lower)
        {
          
		int mid=lower+(higher-lower)/2;
		if(arr[mid]==n)
		{
			return mid;
		}
		else if(arr[mid]>n)
		{
			//lower=0;
			higher=mid-1;
			return BinarySearch(arr, lower, higher, n);
		}
		else if(arr[mid]<n)
		{
			lower=mid+1;
			//higher=arr.length;
			return BinarySearch(arr, lower, higher, n);
		}
        }
		return -1;
	}

	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7,8,9,10};
		BinarySearch b=new BinarySearch();
		int n=10;
		int answer=b.BinarySearch(arr,0,arr.length-1,n);
		System.out.println(answer);
	}
}
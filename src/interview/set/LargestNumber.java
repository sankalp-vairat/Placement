package interview.set;

import java.nio.charset.MalformedInputException;
import java.util.List;

public class LargestNumber {
	// DO NOT MODIFY THE LIST
	public static String largestNumber(Integer arr[]) {
	    
	    //Integer[] arr=(Integer[])a.toArray();
	    sort(arr,0,arr.length-1);
	    String result="";
	    for(int i=0;i<arr.length;i++)
	    {
	        result=result+String.valueOf(arr[i]);
	    }
	    return result;
	}
	
	public static void sort(Integer arr[],int lower,int higher)
	{
	    if(lower<higher)
	    {
	        int mid=(lower+higher)/2;
	        sort(arr,lower,mid);
	        sort(arr,mid+1,higher);
	        merge(arr,mid,lower,higher);
	    }
	}
	
	public static void merge(Integer arr[],int mid,int lower,int higher)
	{
		Integer[] arr1=new Integer[mid-lower+1];
		Integer[] arr2=new Integer[higher-mid];

        int j=0;
        for(int i=lower;i<=mid;i++)
        {
            arr1[j]=arr[i];
            j++;
        }
        j=0;
        for(int i=mid+1;i<=higher;i++)
        {
            arr2[j]=arr[i];
            j++;
        }
        int i=0;
        j=0;
        int current=lower;
        while(i<arr1.length && j<arr2.length)
        {
        	StringBuilder s=new StringBuilder();
        	s.append(arr1[i]);
        	s.append(arr2[j]);
        	
        	StringBuilder s1=new StringBuilder();
        	s.append(arr2[j]);
        	s.append(arr1[i]);
        	
            if((String.valueOf(arr1[i])+String.valueOf(arr2[j])).compareTo((String.valueOf(arr2[j])+String.valueOf(arr1[i])))>0 ||(String.valueOf(arr1[i])+String.valueOf(arr2[j])).compareTo((String.valueOf(arr2[j])+String.valueOf(arr1[i])))==0)
            {
                arr[current]=arr1[i];
                current++;
                i++;
                
            }
            else if((String.valueOf(arr1[i])+String.valueOf(arr2[j])).compareTo((String.valueOf(arr2[j])+String.valueOf(arr1[i])))<0)
            {
                arr[current]=arr2[j];
                current++;
                j++;
                
            }
        }
        
        	if(i<arr1.length)
		{
			while(i<arr1.length)
			{
				arr[current]=arr1[i];
				i++;
				current++;
			}
		}
		if(j<arr2.length)
		{
			while(j<arr2.length)
			{
				arr[current]=arr2[j];
				j++;
				current++;
			}
		}
		
		
	}
	public static void main(String[] args) {
		Integer arr[]={3, 30, 34, 5, 9};
		System.out.println(largestNumber(arr));
	}
}

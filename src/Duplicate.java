
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	
	public static void main(String[] args) {
		
		 int arr1[] = {1, 4, 5, 7, 9};
	       int arr2[] = {4, 5, 7, 9};
		Set<Integer> hs=new HashSet<Integer>();
		if(arr1.length>arr2.length)
		{
		for(int i=0;i<arr2.length;i++)
		{
			hs.add(arr2[i]);
		}
	    
		for(int j=0;j<arr1.length;j++)
		{
			if(!hs.contains(arr1[j]))
			{
				System.out.println("from second list missing:"+arr1[j]);
			}
		}
		
		}
		else
		{
			for(int i=0;i<arr1.length;i++)
			{
				//hs.add(arr1[i]);
			}	
			for(int j=0;j<arr2.length;j++)
			{
				if(!hs.contains(arr2[j]))
				{
					System.out.println("from first list missing:"+arr2[1]);
				}
			}	
		}
	}
}

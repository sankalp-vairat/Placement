/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
class TestClass1 {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int D=sc.nextInt();
       sc.nextLine();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
       	arr[i]=sc.nextInt();
       }
       //int count=0;
       HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
    
       int maxCount=0;
       for(int i=0;i<n;i++)
       {
       		boolean flag=false;
       		int count=0;
       		if(hs.containsKey(arr[i]))
       		{
       			int val=hs.get(arr[i]);
       			count=val;
       			maxCount=maxCount+count;
       			continue;
       		}
       		int no=0;
       	for(int j=i+1;j<n;j++)
       	{
       		if((arr[i]*arr[j])%D==0 )
       		{
       			count++;
       			flag=true;
       			no=arr[j];
       		}
       	}
       	maxCount=maxCount+count;
       	if(flag==true)
       	{
       	hs.put(no,count);
       	}
       }
       System.out.println(maxCount);
    }
}

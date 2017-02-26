import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int order=sc.nextInt();
		    int[] mat=new int[order*order];
		    for(int k=0;k<order*order;k++)
		    {
		        mat[k]=sc.nextInt();
		       // sc.nextInt();
		        
		    }
		    int o=mat.length-order;
		    while(o<mat.length)
		    {
		    for(int j=o;j>=0;j=j-order)
		    {
		        System.out.print(mat[j]);
		        
		    }
		    o++;
		    }
		}
	}
}
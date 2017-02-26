package Dynamic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Histogram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
           // System.out.println(arr[i]);
        }
        //int[] arr1=new int[n];
        int sum=0;
        for(int j=0;j<n;j++)
            {
            //sum=0;
            int f_sum=0;
            int b_sum=0;
            int k=j;
            int l=j+1;
            while(k>=0 && arr[k]>=arr[j])
                {
                f_sum=f_sum+arr[j];
                k--;
            }
            while(l<n && arr[l]>=arr[j])
                {
                b_sum=b_sum+arr[j];
                l++;
            }
            //b_sum+=arr[j];
            if(sum<(b_sum+f_sum))
                {
                //System.out.println(b_sum+"  "+f_sum+"  "+(b_sum+f_sum));
                sum=(b_sum+f_sum);
            }  
        }
        System.out.println(sum);
    }
}
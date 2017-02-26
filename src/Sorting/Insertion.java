package Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Insertion {
    
    

    public static void insertIntoSorted(int[] arr) {
        for(int i=1;i<arr.length;i++)
            {
            int temp=arr[i];
            for(int j=(i-1);j>=0;j--)
                {
                if(temp<arr[j])
                    {
                 arr[i]=arr[j];
                }
                }
             
            }
        printArray(arr);
            
        }
    
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        hashMap.put(1, 2);
        hashMap.replace(1, 2);
       
        
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public int anagram(String str)
        {
        if((str.length()%2)!=0)
            {
            return -1;
        }
        String str1=str.substring(0,(str.length()/2));
        String str2=str.substring((str.length()/2),(str.length()));
        HashMap<String,Integer> hs=new HashMap<String,Integer>();
        for(int i=0;i<str1.length();i++)
            {
            if(hs.containsKey(Character.toString(str1.charAt(i))))
                {
                int val=hs.get(Character.toString(str1.charAt(i)));
                val++;
                hs.put(Character.toString(str1.charAt(i)),val);
            }
            else
                hs.put(Character.toString(str1.charAt(i)),1);
                
        }
        int count=0;
        for(int i=0;i<str1.length();i++)
                                  {
             if(hs.containsKey(Character.toString(str2.charAt(i))) && hs.get(Character.toString(str2.charAt(i)))>0)
                   {
             int val=hs.get(Character.toString(str2.charAt(i)));
             val--;
             hs.put(Character.toString(str2.charAt(i)),val);
                   }
             else
                  {
            	 count++;
                  }
               }
        return count;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
            {
            String str=sc.nextLine();
            Solution sol=new Solution();
            int result=sol.anagram(str);
            System.out.println(result);
            
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
            {
            String str=sc.nextLine();
            int j=0;
            int k=str.length()-1;
            boolean flag=true;
            while(j<k)
                {
                if(str.charAt(j)==str.charAt(k))
                    {
                    j++;
                    k--;
                }
                else
                    {
                    if(str.charAt(j)==str.charAt(k-1))
                        {
                        flag=false;
                        System.out.println(k);
                        break;  
                    }
                    else if(str.charAt(j+1)==str.charAt(k))
                        {
                        flag=false;
                        System.out.println(j);
                        break;
                    }
                }
                
            }
            if(flag==true)
                {
            System.out.println(-1);   
            }
        }
    }
}

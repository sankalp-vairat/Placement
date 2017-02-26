import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Balanced {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<String> s1=new Stack<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        sc.nextLine();
        while(i<n)
            {
            
            String s=sc.nextLine();
            System.out.println();
            for(int j=0;j<s.length();j++)
                {
                if(s1.isEmpty())
                    {
                    s1.push(String.valueOf(s.charAt(j)));
                }
                else
                    {
             
                    if(s1.peek().equals("{") && String.valueOf(s.charAt(j)).equals("}"))
                       {
                           s1.pop();
                           continue;
                       }
                    else if(s1.peek().equals("[") && String.valueOf(s.charAt(j)).equals("]"))
                       {
                           s1.pop();
                           continue;
                       }
                         else if(s1.peek().equals("(") && String.valueOf(s.charAt(j)).equals(")"))
                       {
                           s1.pop();
                           continue;
                       }
                    else
                        {
                    s1.push(String.valueOf(s.charAt(j)));
                    }
                       
                }
                
            }
            if(s1.isEmpty())
                {
                System.out.println("YES");
            }
            else
                {
                System.out.println("NO");
            }
                i++;
        }
    }
}
import java.util.Scanner;
import java.util.Stack;

class TestClass {
    public static void main(String args[] ) throws Exception {
   
   	Scanner sc=new Scanner(System.in);
   	int n=sc.nextInt();
   	for(int i=0;i<n;i++)
   	{
   		sc.nextLine();
   		String line=sc.nextLine();
   		String.valueOf(3);
   		line = line.replace(" " , "");
   		//String out="$";
   		int count=0;
   		boolean flag=false;
   		String out="";
   		Stack s=new Stack();
   		s.isEmpty();
   		int index=0; 
   		for(int j=0;j<line.length();j++)
   		{
   			
   			if(line.charAt(j)=='$')
   			{
   				flag=true;
   				j=j+1;
   			}
   			if(flag==true)
   			{
   				if(Integer.parseInt(Character.toString(line.charAt(j)))>=0 && Integer.parseInt(Character.toString(line.charAt(j)))<=9 )
   				{	
   					out=out.concat(Character.toString(line.charAt(j)));
   					flag=true;
   				}
   			}
   		}
   		for(int o=1;o<out.length();o++)
   		{
   			if(out.charAt(o)==0)
   			{
   				
   			}
   		}
   		System.out.println(out);
   	}
    }
}
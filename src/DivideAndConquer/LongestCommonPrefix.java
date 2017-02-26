package DivideAndConquer;

public class LongestCommonPrefix {

	public static String Compare(String s1,String s2)
	{
		String result="";
		for(int i=0,j=0;i<s1.length() && j<s2.length();i++,j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
				result=result+s1.charAt(i);
			else
				break;
		}
		return result;
	}
	
	public static String Divide(String []arr,int lower,int higher )
	{
		if(higher>lower)
		{
		int mid=(higher+lower)/2;
		String s1=Divide(arr,lower,mid);
		String s2=Divide(arr,mid+1,higher);
		return Compare(s1,s2);
		}
		return arr[lower];
	}
	
	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks","geek", "geezer"};
		System.out.println(Divide(arr,0,arr.length-1));
	}
}
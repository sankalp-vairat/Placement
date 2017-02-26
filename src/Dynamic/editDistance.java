package Dynamic;
import java.util.HashMap;

public class editDistance {

	public static int min(int a,int b,int c)
	{
		if (a < b && a <c) 
			return a;
        if (b < a && b < c) 
        	return b;
        else 
        	return c;
	}
	
	public static int editD(String s1,String s2,int i,int j,HashMap<String,Integer>hs )
	{
		if(i<=-1 || j<=-1)
			return 1;
		String key=String.valueOf(i)+String.valueOf(j);
		if(hs.containsKey(key))
		{
			int res=hs.get(key);
			return res;
		}
		else
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				int res2=editD(s1,s2,i-1,j-1,hs);
				hs.put(key, res2);
				return res2;
			}
			else
			{
				int res1=1+min(editD(s1,s2,i-1,j,hs),editD(s1,s2,i,j-1,hs),editD(s1,s2,i-1,j-1,hs));
				hs.put(key, res1);
				return res1;
			}
		}
	}
	public static void main(String[] args) {
		String str1="sunday";
		String str2="saturday";
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		int res=editD(str1, str2, str1.length()-1, str2.length()-1, hs);
		System.out.println(res);
	}
}

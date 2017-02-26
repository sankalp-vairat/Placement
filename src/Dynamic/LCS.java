package Dynamic;
import java.util.HashMap;

public class LCS {

	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	private static int LCS(String s1,String s2,int i,int j,HashMap<String,Integer> hs)
	{
		if(i>-1 && j>-1)
		{
			String key=String.valueOf(i)+String.valueOf(j);
			if(hs.containsKey(key))
			{
				int val=hs.get(key);
				return val;
			}
			else
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					//System.out.println("hello1");
					
					int res=1+LCS(s1,s2,i-1,j-1,hs);
					//System.out.println(String.valueOf(s1.charAt(i)));
					hs.put(key, res);
					return res;
				}
				else
				{
					//System.out.println("hello2");
					int res1=max(LCS(s1,s2,i-1,j,hs),LCS(s1,s2,i,j-1,hs));
					hs.put(key, res1);
					return res1;
				}	
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		String s1="AGGTAB";
		String s2="GXTXAYB";
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		int res=LCS(s1,s2,s1.length()-1,s2.length()-1,hs);
		System.out.println(res);		
	}
}

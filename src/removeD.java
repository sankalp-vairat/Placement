
public class removeD {

	public static void remove(char[] s,int n)
	{
		int count=n;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;)
			{
				if(s[i]==s[j])
				{
					s[j]=s[--n];
				}
				else
					j++;
				
			}
			
			
		}
		s[n]='\0';
	}
	
	public static void main(String[] args) {
		
		char[]s={'s','a','n','k','a','l','p'};
		remove(s,s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}


public class solve {

	public static int min(int a,int b)
	{
		if(a<b)
			return a;
		return b;
	}

	public static int operations(int[] arr)
	{
		int operation_count=0;
		int zero_count=0;
		
		while(zero_count!=(arr.length))
		{
			int even_count=0;
			zero_count=0;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==0)
						zero_count++;
					if((arr[i]%2)!=0)
					{
						arr[i]=arr[i]-1;
						operation_count++;
						even_count++;
					}
					else
					{
						even_count++;
					}
				}
				if((even_count==arr.length))
				{
					boolean flag=false;
					for(int j=0;j<arr.length;j++)
					{
						if(arr[j]!=0)
							flag=true;
							arr[j]=arr[j]/2;
					}
					if(flag==true)
						operation_count++;
				}
		}
		return operation_count;
	}

	public static void main(String[] args) {
		int[] arr={16,16,16};
		int count=0;
			count=operations(arr);
		System.out.println(count);
	}
}
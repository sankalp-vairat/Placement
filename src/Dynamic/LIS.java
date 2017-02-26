package Dynamic;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LIS {

	public static int lis(int[] arr,int n,int index)
	{
	//HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int []arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=1;
		}
	for(int i=(n-1);i>=0;i--)
	{
		if((i+1)<n && arr[i]<=arr[i+1])
		{
			//hs.put(arr[i], hs.get(arr[i+1])+1);
			arr1[i]=arr1[i+1]+1;
		}
		else
		{
			int max=0;
			for(int j=i+1;j<n;j++)
			{
				if((j+1)<n && arr[i]<arr[j+1])
				{
//					if(max<hs.get(arr[j+1]))
//					{
//						max=hs.get(arr[j+1]);
//					}
//					else
//					{
//						continue;
//					}
					if(max<arr1[j+1])
					{
						max=arr1[j+1];
					}
					else
					{
						continue;
					}
				}
			}
			//hs.put(arr[i],max+1);
			arr1[i]=max+1;
		}
	}
	int result_max=0;
//	Iterator it=hs.entrySet().iterator();
//	while(it.hasNext())
//	{
//		Map.Entry<Integer, Integer> o=(Map.Entry<Integer, Integer>)it.next();
//		if(result_max<o.getValue())
//			result_max=o.getValue();
//	}
	//Iterator it=hs.entrySet().iterator();
	int o=0;
	while(o<n)
	{
		//Map.Entry<Integer, Integer> o=(Map.Entry<Integer, Integer>)it.next();
		if(result_max<arr1[o])
			result_max=arr1[o];
		o++;
	}
		return result_max;	
	}
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
            try{
                sc.nextLine();
            }
            catch(Exception e)
                {
                continue;
            }
        }
        
        int res=lis(arr, n,0);
        System.out.println(res);
		
	}
}

package Dynamic;
import java.util.HashMap;

public class Fibonacci2 {
	public int fibonacci(int num,final HashMap<Integer,Integer> hs)
	{
	if(hs.containsKey(num))
	{
		System.out.println("hello");
		return hs.get(num);
	}
	else
	{
		if(num<=1)
			return 1;
		else
		{
			System.out.println("hello1");
			int f=fibonacci(num-1, hs)+fibonacci(num-2, hs);
			hs.put(num, f);
			return f;
		}
	}
	}
	
public static void main(String[] args) {
	Fibonacci2 fb=new Fibonacci2();
	HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	int ans=fb.fibonacci(5-1,hs);
	System.out.println(ans);
   }
}

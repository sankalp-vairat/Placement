package Dynamic;
import java.math.BigInteger;

public class Fibonacci1 {
	
	public BigInteger fibonacci(BigInteger num)
	{
		//BigInteger n;
		if(num.compareTo(BigInteger.valueOf(0))>0)
		{
			return fibonacci(num.subtract(BigInteger.valueOf(1)).add(fibonacci(num.subtract(BigInteger.valueOf(2)))));
			
		}
		return BigInteger.valueOf(1);
	}
	
public static void main(String[] args) {
	Fibonacci1 fb=new Fibonacci1();
	BigInteger ans=fb.fibonacci(BigInteger.valueOf(5));
	System.out.println(ans.intValue());
}
}

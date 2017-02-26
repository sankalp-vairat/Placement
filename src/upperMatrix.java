import java.math.BigInteger;
import java.util.Stack;

public class upperMatrix {

	public static void change(int[] arr)
	{
		arr[0]=1;
		arr[1]=2;
		
	}
	
	public static void main(String[] args) {
		
		int[]arr=new int[2];
	    arr[0]=4;
	    arr[1]=5;
		BigInteger[] g=new BigInteger[5];
	change(arr);
	System.out.println(arr[0]);
	System.out.println(arr[1]);
		
	}
}

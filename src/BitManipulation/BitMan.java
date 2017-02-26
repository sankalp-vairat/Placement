package BitManipulation;

public class BitMan {

	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(-75));
		System.out.println((-75>>1));
		System.out.println(Integer.toBinaryString(-75>>>2));
		
		int x=-93242;
		int count=40;
		for(int i=0;i<count;i++)
		{
			x>>=1;
		}
		System.out.println(x);
		
		x=-93242;
		count=40;
		for(int i=0;i<count;i++)
		{
			x>>>=1;
		}
		System.out.println(x);
	}
}

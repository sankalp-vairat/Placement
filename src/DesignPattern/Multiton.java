package DesignPattern;

public class Multiton {

	private static Multiton[] count;
	
	private Multiton()
	{
		
	}
	
	public static void initialize(int n)
	{
		count=new Multiton[n];
	}
	
	public static Multiton create(int i)
	{
		if(i>count.length-1)
		{
			return null;
		}
		else
		{
			if(count[i]==null)
			{
				count[i]=new Multiton();
				return count[i];
			}
			else
			{
				return count[i];
			}
		}
	}
	public static void main(String[] args) {
		Multiton.initialize(3);
		System.out.println(create(0));
		System.out.println(create(1));
		System.out.println(create(2));
		System.out.println(create(3));
	}
}

package DesignPattern;

public class Multiton1 {

	private static int count=0;
	
	private Multiton1()
	{
		
	}
	
	public static Multiton1 create()
	{
		if(count==0)
		{
			count++;
			return new Multiton1();
		}
		return null;
	}
}

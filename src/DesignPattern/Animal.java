package DesignPattern;

public class Animal {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//System.out.println(AFactory.createObject());
		Factory<Animal> f=new Factory<Animal>(Animal.class);
		Animal a=f.createObject();
		System.out.println(a.toString());
	}
}
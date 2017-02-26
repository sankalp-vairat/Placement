package DesignPattern;

public class Driver {

	public static void main(String[] args) {
		System.out.println(Multiton1.create());
		System.out.println(Multiton1.create());
		//------------------------------------------------------------
		Multiton.initialize(3);
		System.out.println(Multiton.create(0));
		System.out.println(Multiton.create(1));
		System.out.println(Multiton.create(2));
		System.out.println(Multiton.create(3));
	}
}

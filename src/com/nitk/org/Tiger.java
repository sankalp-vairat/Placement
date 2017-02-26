package com.nitk.org;

public class Tiger extends Animal{

	
	int c;
	int d;
	public Tiger() {
		//super(6,7);
		this.c=5;
		this.d=6;
		// TODO Auto-generated constructor stub
	}
//	public Tiger(int c,int d) {
//		// TODO Auto-generated constructor stub
//	}
	
	public void display()
	{
		System.out.println("Tiger");
	}
	public static void main(String[] args) {
		
		Tiger a=new Tiger();
		a.display();
		System.out.println(a.a);
	}
}

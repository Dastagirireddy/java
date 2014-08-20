package com.javaexample.Inheritance;

public class ADemo 
{
	public static void main(String[] args) 
	{
		B bb=new B(10,20,40);
		bb.sum();
		System.out.println("The B's c calues is:"+bb.c);
		System.out.println("---------------");
		D dd=new D(10,20);
		dd.display();
		System.out.println("--------------");
	}
}

package com.javaexample;

public class OverLoadingBoxDemo2 
{

	public static void main(String[] args)
	{
		Box2 b=new Box2();
		b.test();
		b.test(5);
		b.test(10, 20);
		double dd=b.test(6.0);
		System.out.println("The double Value is:"+dd);
	}

}

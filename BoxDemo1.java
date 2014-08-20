package com.javaexample;

public class BoxDemo1 
{

	public static void main(String[] args) 
	{
		Box b1=new Box(10,20,30);
		double vol=b1.volume();
		System.out.println("The volume is:"+vol);
	}

}

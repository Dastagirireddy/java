package com.javaexample;

public class OverloadConstrcutorBoxDemo3 
{

	public static void main(String[] args) 
	{
		Box3 b1=new Box3(10,20,30);
		System.out.println("The first Box object volume is:"+b1.volume());
		
		Box3 b2=new Box3(10);
		System.out.println("The second Box object volume is:"+b2.volume());
	}

}

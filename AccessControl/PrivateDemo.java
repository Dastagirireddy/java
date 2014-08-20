package com.javaexample.AccessControl;

public class PrivateDemo 
{
	public static void main(String[] args)
	{
		UsageOfPrivate p=new UsageOfPrivate();
		//Error--If we un comment below line.
		//p.a=100;
		//Private variables accessed and set via methods only.
		p.setA(10);
		System.out.println("The value of A is:"+p.getA());
	}
}

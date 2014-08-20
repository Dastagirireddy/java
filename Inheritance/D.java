package com.javaexample.Inheritance;

public class D extends C
{
	int a;
	public D(int c,int d) 
	{
		//Second usage of super. Whenever super & sub class having same variable name then super.variable name specifies the super class variable.
		super.a=c;
		a=d;
	}

	public void display()
	{
		System.out.println("The super class a value is:"+super.a);
		System.out.println("The sub class a value is:"+a);
	}
}

package com.javaexample.Inheritance;

public class B extends A 
{
	int c;
	public B(int a,int b,int c) 
	{
		//This is the first usage of super. Here super calls the immediate super class constructor.
		super(a,b);
		this.c=c;
	}

}

package com.javaexample;

public class UsageOfConstructor 
{
	int a,b;
	public UsageOfConstructor(int x,int y)
	{
		this.a=x;
		this.b=y;
	}
	
	public void display()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) 
	{
		UsageOfConstructor usage=new UsageOfConstructor(10,30);
		usage.display();
	}

}

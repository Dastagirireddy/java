package com.javaexample;

public class Sam
{

	public static void main(String[] args)
	{
		Sa1 s1=new Sa1(10, 20);
		System.out.println(s1.mul());
	}

}

class Sa1
{
	int a,b;
	public Sa1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int mul()
	{
		return a * b;
		
	}
}

package com.javaexample.Interface;

interface Interface1
{
	int sum(int a,int b);
}

public class InterfaceDemo implements Interface1
{
	
	public static void main(String[] args) 
	{
		Interface1 i=new InterfaceDemo();
		int sum=i.sum(10, 20);
		System.out.println(sum);
	}

	public int sum(int a, int b) 
	{
		int c=a+b;
		return c;
		
	}

}

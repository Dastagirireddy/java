package com.javaexample.passingArguments;

class SwapOne
{
	int a,b;
	public SwapOne(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void swap()
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
}

public class SwapCallByValue
{
	public static void main(String[] args)
	{
		int x=10,y=20;
		SwapOne s1=new SwapOne(x,y);
		System.out.println("Before:"+x+" "+y);
		s1.swap();
		System.out.println("After:"+x+" "+y);
	}

}

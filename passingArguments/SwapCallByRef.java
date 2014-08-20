package com.javaexample.passingArguments;

class SwapTwo
{
	int a,b;
	public SwapTwo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void Swap(SwapTwo o)
	{
		int temp;
		temp=o.a;
		o.a=o.b;
		o.b=temp;
	}
}

public class SwapCallByRef 
{
	public static void main(String[] args) 
	{
		SwapTwo s1=new SwapTwo(10,20);
		System.out.println("Before:"+s1.a+" "+s1.b);
		s1.Swap(s1);
		System.out.println("After:"+s1.a+" "+s1.b);
	}

}

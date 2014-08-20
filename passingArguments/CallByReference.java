package com.javaexample.passingArguments;

class CallRef
{
	int a,b;
	public CallRef(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void test(CallRef c)
	{
		c.a=30;
		c.b=40;
	}
}

public class CallByReference 
{
	public static void main(String[] args) 
	{
		int a=20,b=30;
		System.out.println("Before:"+a+" "+b);
		CallRef c2=new CallRef(a,b);
		c2.test(c2);
		System.out.println("After:"+c2.a+" "+c2.b);
	}

}

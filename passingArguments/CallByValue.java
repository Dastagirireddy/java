package com.javaexample.passingArguments;

class Caller
{
	void test(int a,int b)
	{
		a=a+10;
		b=b-10;
	}
}

public class CallByValue 
{

	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		System.out.println("Before:"+ a +" "+b);
		Caller c=new Caller();
		c.test(a,b);
		System.out.println("After:"+ a +" "+b);
	}

}

package com.javaexample.ExceptionHandling;

public class Exceptions3 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=0;
			System.out.println(a/b);
			throw new ArithmeticException("Division by zero error");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught:" +e);
		}
	}

}

package com.javaexample.ExceptionHandling;

/*
 * Exception:--
 *  It is nothing but abnormal condition that arises when sequence of steps arise at runtime.
 */
public class Exception1 
{

	public static void main(String[] args)
	{
		try
		{
			int a=10,b=0;
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Exception arise:" +e);
		}
		finally
		{
			System.out.println("Exception caught..!!");
		}
	}

}

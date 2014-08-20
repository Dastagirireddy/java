package com.javaexample.ExceptionHandling;

public class Exception4 
{

	public static void main(String[] args) 
	{
		try
		{
			int len = args.length;
			System.out.println(len);
			try
			{
				if(len==1)
					throw new IllegalAccessException("Caught..!!!");
			}
			catch(IllegalAccessException e)
			{
				System.out.println("Hii..."+e);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Exception" +e);
		}
	}

}

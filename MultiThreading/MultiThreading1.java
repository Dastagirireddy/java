package com.javaexample.MultiThreading;

public class MultiThreading1 
{
	Thread t;
	
	public MultiThreading1(ThreadExample te) 
	{
		t=new Thread(te);
		t.start();
	}
	
	public MultiThreading1()
	{
		
	}
	
	public static void main(String[] args)
	{
		ThreadExample te=new ThreadExample();
		new MultiThreading1(te);
		try
		{
			for(int i=6;i<=10;i++)
			{
			Thread.sleep(100);
			System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


class ThreadExample implements Runnable
{

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(1000);
			System.out.println(i);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
}

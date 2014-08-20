package com.javaexample.MultiThreading;

public class MultiThreadingUsingRunnable implements Runnable
{
	
	Thread t;
	
	public MultiThreadingUsingRunnable()
	{
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		System.out.println("Thread Excution started..!!");
		for(int i=1;i<=5;i++)
		{
			try
			{
				//Child thread execution started..!!
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured..." +e);
			}
		}
		
		System.out.println("Thread Exited..!!");
	}
	
	public static void main(String[] args) 
	{
		new MultiThreadingUsingRunnable();
		
		try
		{
			//This will causes after three 3 seconds main will be exited..!! 
			Thread.sleep(3000);
			System.out.println("Main thread exited..!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

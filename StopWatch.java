package com.javaexample;

import java.io.IOException;

public class StopWatch 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		int h=0,m=0,s=0;
		while(true)
		{
			s++;
			Thread.sleep(1000);
			if(s==60)
			{
				s=0;
				m++;
			}
			
			if(m==60)
			{
				m=0;
				h++;
			}
			System.out.println(h+" : "+m+" : "+s);
		}
	
	}

}

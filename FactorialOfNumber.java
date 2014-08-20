package com.javaexample;

import java.util.Scanner;

public class FactorialOfNumber
{

	public int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
		{
			return n* factorial(n-1);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=s.nextInt();
		FactorialOfNumber f=new FactorialOfNumber();
		int res=f.factorial(n);
		System.out.println(res);
		s.close();
	}

}

package com.javaexample;

import java.util.Scanner;

public class ListingEvenBetweenNumbers 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,n;
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		while(a<=b)
		{
			n=a;
			if(n%2==0)
			{
				System.out.println(a);
			}
			a++;
		}
		s.close();
	}

}

package com.javaexample;

import java.util.Scanner;

public class LargestOfThree 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the 1st number:");
		a=s.nextInt();
		System.out.println("Enter the 2nd number:");
		b=s.nextInt();
		System.out.println("Enter the 3rd numbers");
		c=s.nextInt();
		if((a>b) && (a>c))
		{
			System.out.println("A is larger Number");
		}
		else if(b>c)
		{
			System.out.println("B is larger number");
		}
		else
		{
			System.out.println("C is larger number");
		}
		
		s.close();
	}

}

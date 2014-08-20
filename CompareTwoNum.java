package com.javaexample;

import java.util.Scanner;

public class CompareTwoNum 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a=s.nextInt();
		System.out.println("Enter the 2nd number:");
		int b=s.nextInt();
		if(a!=b)
		{
			System.out.println("Numbers are different..!!");
		}
		else 
		{
			System.out.println("Numbers are equal...!!");
		}
		s.close();
	}

}

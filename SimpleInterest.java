package com.javaexample;

import java.util.Scanner;

public class SimpleInterest
{

	public static void main(String[] args) 
	{
		float p;
		int t;
		float r,totalamount;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principle:");
		p=s.nextInt();
		System.out.println("Enter the total no of months:");
		t=s.nextInt();
		System.out.println("Enter the rate:");
		r=s.nextFloat();
		totalamount=(p * t * r)/100;
		System.out.println(totalamount + p);
		s.close();
	}

}

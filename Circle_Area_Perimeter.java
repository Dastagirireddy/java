package com.javaexample;

import java.util.Scanner;

public class Circle_Area_Perimeter 
{

	public static void main(String[] args) 
	{
		final double PI=3.14159;
		Scanner s=new Scanner(System.in);
		double r;
		System.out.println("Enter the radius:");
		r=s.nextDouble();
		
		System.out.println("Area:");
		System.out.println(PI * r * r);
		
		System.out.println("Perimeter:");
		System.out.println(2 * PI * r);
		s.close();
	}

}

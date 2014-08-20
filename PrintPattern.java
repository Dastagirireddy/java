package com.javaexample;

import java.util.Scanner;

public class PrintPattern 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the odd number of rows only:");
		int n=s.nextInt();
		int k=0;
		if(n%2==1)
		{
		for(int i=1;i<=n;i++)
		{
			k++;
			for(int j=1;j<=n;j++)
			{
				
				if(i<=n/2)
				{
					if(j<=i)
					{
						
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==(n/2 + 1))
				{
					System.out.print("* ");
				}
				else
				{
					if(j<=n/2 && j<=(n-k+1))
					System.out.print("* ");
					else
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		}
		else
		{
			System.out.println("Please enter the odd number os rows..!!");
		}
		s.close();
	}

}

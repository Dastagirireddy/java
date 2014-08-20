package com.javaexample;

public class StringSplit
{

	public static void main(String[] args) 
	{
		
		//Delimiter ?
		String s1="this is sample program?by admin";
		String sub[];
		sub=s1.split("\\?");
		for(int i=0;i<sub.length;i++)
			System.out.println(sub[i]);
		
		//Delimiter -
		String s2="this is another-sample program";
		String sub2[];
		sub2=s2.split("-");
		for(int i=0;i<sub2.length;i++)
		{
			System.out.println(sub2[i]);
		}
		
	}

}

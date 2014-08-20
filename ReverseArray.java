package com.javaexample;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		int m=a.length;
		for(int i=0;i<m/2;i++)
		{
			int temp=a[i];
			a[i]=a[m-i-1];
			a[m-i-1]=temp;
		}
		for(int j=0;j<m;j++)
			System.out.println(a[j]);
	}

}

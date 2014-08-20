package com.javaexample;

import javax.swing.JOptionPane;

public class DeleteElementArray
{

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number:"));
		int[] arr=new int[n];
		for(int k=0;k<n;k++)
		{
			int e=Integer.parseInt(JOptionPane.showInputDialog("Enter the element"+(k+1)));
			arr[k]=e;
		}
		
		int pos=Integer.parseInt(JOptionPane.showInputDialog("enter the position:"));
		int i,j;
		try
		{
			for(i=0,j=0;i<n;i++,j++)
			{
				if(pos==i)
				{
					while(j<n)
					{
						arr[j]=arr[j+1];
						j++;
					}
					break;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(i=0;i<n-1;i++)
			System.out.println(arr[i]);
	}

}

package com.javaexample;

public class Stack 
{

	int stack[]=new int[10];
	int tos=-1;
	/*public Stack() 
	{
		
	}*/
	
	public void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Stack is full..!!");
		}
		else
		{
			stack[++tos]=item;
		}
	}
	
	public void pop()
	{
		if(tos==-1)
		{
			System.out.println("Stack is Underflow..!!!");
		}
		else
		{
			;
		}
	}

}

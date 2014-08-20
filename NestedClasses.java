package com.javaexample;

public class NestedClasses
{
	int a,b,c;
	class AnotherClass
	{
		public void display()
		{
			System.out.println("The Nested class Display Method output:"+(a * b * c));
		}
	}
	
	public static void main(String[] args)
	{
		NestedClasses nest=new NestedClasses();
		nest.a=10;
		nest.b=20;
		nest.c=30;
		AnotherClass n=nest.new AnotherClass();
		n.display();
	}

}

package com.javaexample.Inheritance;


class Dynamic1
{
	public void display()
	{
		System.out.println("Super class method..!!");
	}
}


class Dynamic2 extends Dynamic1
{
	public void display()
	{
		System.out.println("Sub class method..!!");
	}
}


public class DynamicMethodDispatch
{

	public static void main(String[] args)
	{
		Dynamic1 d1=new Dynamic1();
		Dynamic2 d2=new Dynamic2();
		
		//This will creates a reference to super class.
		Dynamic1 d3;
		//By using this we can execute different versions of overriden methods.
		d3=d1;
		//This is a super class method.
		d3.display();
		
		d3=d2;
		//This is a sub class overridden method.
		d3.display();
	}

}

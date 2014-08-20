package com.javaexample.Inheritance;


class OverDemo
{
	public void display()
	{
		System.out.println("Super Class..!!");
	}
}

class Over extends OverDemo
{
	//Overrides the super class method.
	public void display()
	{
		//Display this super invokes the super class display method.
		super.display();
		
		System.out.println("Sub class..!!");
	}
}
public class Overriding 
{

	public static void main(String[] args) 
	{
		Over over=new Over();
		over.display();
	}

}

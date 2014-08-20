package com.javaexample.Inheritance;

/*
 * Abstract Class:---
 *  It nothing but like a normal class. But contains the abstract methods and of course it contains concrete method. 
 *  If we declared the method as abstract then class name must be the abstract class.
 *  Abstract class doesn't provide pure abstraction because it contains abstract and concrete methods.
 *  One more Important point about abstract class is "We can't instantiate the abstract class i.e,.. we can't object for the abstract class."
 *  It contains only method declarations. And the implementation done by the sub classes.
 *  And the sub classes must override the abstract class method.
 */


class Abstract1 extends AbstractClass
{
	//Overrides the super class method this is the implementation of super class display method.
	public void display()
	{
		System.out.println("Abstract Demo..!!");
	}
}

class AbstractDemo
{
	public static void main(String[] args)
	{
		Abstract1 a1=new Abstract1();
		a1.display();
		a1.demo();
	}
}

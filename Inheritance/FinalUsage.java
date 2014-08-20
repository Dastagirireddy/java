package com.javaexample.Inheritance;
/* 
 * final :----Three uses of final keyword.
 * 1)To define the constants.
 * 
 * 2)Remaining two uses are used in inheritance.
 * If we declare the super class method as final then we can't override the method.
 * 
 * 3)Third usage is If we declared the class as final then we can't perform the inheritance. And by default all the methods are final if we declare the class as final.
 * 
 * */
//Second Usage
class Final1
{
	final public void display()
	{
		System.out.println("Super Class");
	}
}

class Final2 extends Final1
{
	//If we remove the comments u will get compile time error. Because the method in super class declared as final.
	/*public void display()
	{
		System.out.println("Sub Class");
	}*/
}


//Third Usage
final class Final3
{
	public void display()
	{
		System.out.println("Super class");
	}
}

//If we remove the comments u will get compile time errors. Because the super class declared as final. So we can't extends the super class.
/*
class Final4 extends Final3
{
	public void display()
	{
		System.out.println("Sub Class");
	}
}
*/

public class FinalUsage
{

	public static void main(String[] args)
	{
		
	}

}

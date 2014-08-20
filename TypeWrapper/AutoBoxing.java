package com.javaexample.TypeWrapper;

public class AutoBoxing 
{

	public static void main(String[] args)
	{
		//Boxing-- converting primitive data type into wrapper classes.
		Integer io=new Integer(99);
		
		//Unboxing-- converting wrapper classes into primitive type data.
		int i=io.intValue();
		System.out.println("Type wrapper:"+io+"  The primitive data:"+i);
		
		
		//Auto boxing --- we don't create any object for the wrapper classes. In built java creates objects. 
		//We can directly values to wrapper classes. It will automatically convert primitive to wrapper.
		
		
	}

}

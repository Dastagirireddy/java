package com.javaexample.Interface;


interface Interface3
{
	void display();
	int displayN(int n);
}

public class InterfaceDemo3 implements Interface3
{
	public static void main(String[] args) 
	{
		InterfaceDemo3 d=new InterfaceDemo3();
		d.display();
		System.out.println(d.displayN(10));
	}

	public void display() 
	{
		System.out.println("Hii..!!");
	}

	public int displayN(int n) 
	{
		return n;
	}

}

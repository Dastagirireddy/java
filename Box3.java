package com.javaexample;

public class Box3
{
	double width,height,depth;
	
	public Box3(double w,double h,double d) 
	{
		width=w;
		height=h;
		depth=d;
	}
	
	public Box3()
	{
		width=0;
		height=0;
		depth=0;
	}
	
	public Box3(double val)
	{
		width=height=depth=val;
	}
	
	public double volume()
	{
		return width * height * depth;
	}
}

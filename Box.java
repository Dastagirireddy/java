package com.javaexample;

public class Box
{

	double width,height,depth;
	public Box(double width,double height,double depth) 
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public double volume()
	{
		return width * height * depth;
	}

}

package com.javaexample;

import java.util.Date;

public class SystemDates
{
	public static void main(String[] args)
	{
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.toLocaleString());
		System.out.println(d.toGMTString());
	}

}

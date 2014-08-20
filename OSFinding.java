package com.javaexample;

public class OSFinding 
{

	public static void main(String[] args) 
	{
		String os="os.name";
		String ver="os.version";
		String arch="os.arch";
		System.out.println(System.getProperty(os));
		System.out.println(System.getProperty(ver));
		System.out.println(System.getProperty(arch));
	}
}

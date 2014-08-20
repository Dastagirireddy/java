package com.javaexample.Interface;

import java.sql.Connection;
import java.sql.DriverManager;
interface Interface2
{
	String className="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/dastaDB";
	String username="root";
	String password="dasta";
}

public class InterfaceDemo2 implements Interface2
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName(className);
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection established..!!");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	protected void finalize()
	{
		System.out.println("Connection closed..!!!");
	}
}

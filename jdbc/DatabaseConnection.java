package com.javaexample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements ConnectionParams
{
	static Connection con=null;
	public static boolean Connectionsetup() throws ClassNotFoundException, SQLException
	{
		Class.forName(className);
		con=DriverManager.getConnection(url,user,password);
		if(con!=null)
			return true;
		else
		return false;
	}
	
	public static void ConnectionClose() throws SQLException
	{
		con.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		if(DatabaseConnection.Connectionsetup())
		{
			System.out.println("Connection success..!!");
		}
		
		else
			System.out.println("Connection Unsuccessfull..!!!");
		
		DatabaseConnection.ConnectionClose();
	}
}

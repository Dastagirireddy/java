package com.javaexample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSetup implements ConnectionParams
{
	//Checked Exception--- Compile Time Exception
	static Connection con=null;
	public void setup() throws ClassNotFoundException, SQLException
	{
		Class.forName(className);
		con=DriverManager.getConnection(url, user, password);
	}
	
	public void closeSetup() throws SQLException
	{
		con.close();
	}
	
}

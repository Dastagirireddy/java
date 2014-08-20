package com.javaexample.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Connection1 extends ConnectionSetup
{
	public void setup() throws ClassNotFoundException, SQLException
	{
		super.setup();
	}
	
	
	public boolean setupOne() throws SQLException
	{
		Statement stmt=(Statement) ConnectionSetup.con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from iplogin");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		return false;
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection1 c=new Connection1();
		c.setup();
		c.setupOne();
		c.closeSetup();
	}

}

package com.kshrd.connectionmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Connection  conn = null;
	public static String NAME_URL="jdbc:mysql://localhost:3306/stockmanagementsystem";
	private ConnectionManager() {}
	
	public static  Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Properties p = new Properties();
		p.put("user", "postgres");
		p.put("password", "123");
		if (conn==null)
		{
			conn= DriverManager.getConnection(NAME_URL,p);
		}
		return conn;
	}

}

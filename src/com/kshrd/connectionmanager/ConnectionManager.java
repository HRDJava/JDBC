package com.kshrd.connectionmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Connection  conn = null;
	public static String URL="jdbc:postgresql://localhost:5432/jdbc";
	private ConnectionManager() {}
	
	public static  Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Properties p = new Properties();
		p.put("user", "postgres");
		p.put("password", "123");
		if (conn==null)
		{
			conn= DriverManager.getConnection(URL,p);
			
		}
		return conn;
	}

}

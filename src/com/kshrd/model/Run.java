package com.kshrd.model;

import java.sql.SQLException;

public class Run {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Product p = new Product();
		InsertData insertdata = new InsertData();
		System.out.println("Please");
		insertdata.doInsert();
	}
}

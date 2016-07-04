package com.kshrd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.kshrd.connectionmanager.ConnectionManager;

public class InsertData {
	Scanner sc = new Scanner(System.in);
	int a = 4;
	int id = sc.nextInt();
	String name = sc.next();
	int qty = sc.nextInt();
	float price = sc.nextInt();
	//toatal price
	public float getTotal()
	{
		float total = qty * price;
		return total;
	}
	public void doInsert() throws ClassNotFoundException, SQLException
	{
			Connection  con = ConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			
			ArrayList<Product> product = new ArrayList<>();
			Product  p = new Product(this.id, this.name, this.qty, this.price, getTotal());
			product.add(p);
			con.setAutoCommit(false);
			String sql="Insert into tblProduct Values(?,?,?,?,?)";
			PreparedStatement pstmpt = con.prepareStatement(sql);
			pstmpt.setInt(1, p.getId());
			pstmpt.setString(2, p.getName());
			pstmpt.setInt(3, p.getId());
			pstmpt.setFloat(4, p.getId());
			pstmpt.setFloat(5, getTotal());
			pstmpt.executeUpdate();
			con.commit();
	}

}

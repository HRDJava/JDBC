package com.kshrd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kshrd.connectionmanager.ConnectionManager;
import com.kshrd.controller.StudentDTO;

public class StudentDAO {
	
	public void doInsert(StudentDTO  student) throws ClassNotFoundException, SQLException{
		Connection  con = ConnectionManager.getConnection();
		PreparedStatement  pstmt =con.prepareStatement("INSERT INTO tblstudent VALUES(?,?,?,?,?,?)");
		pstmt.setInt(1, student.getStuid());
		pstmt.setString(2, student.getStuname());
		pstmt.setString(3, student.getSex());
		pstmt.setString(4, student.getPhone());
		pstmt.setString(5, student.getEmail());
		pstmt.setInt(6, student.getScore());
		pstmt.executeUpdate();
		if(con !=null)
		{
			con.close();
		}
	}
	public void doUpdate(StudentDTO student) throws ClassNotFoundException, SQLException{
		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement("UPDATE tblstudent SET stuname=? ,sex=?, email=?,phone=?,score=? WHERE stuid=?");
		pstmt.setInt(1, student.getStuid());
		pstmt.setString(2, student.getStuname());
		pstmt.setString(3, student.getSex());
		pstmt.setString(4, student.getPhone());
		pstmt.setString(5, student.getEmail());
		pstmt.setInt(6, student.getScore());
		pstmt.executeUpdate();
		if(con !=null)
		{
			con.close();
		}
	}
	public void doDelete(StudentDTO student) throws ClassNotFoundException, SQLException{
		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM tblstudent WHERE stuid=?");
		pstmt.setInt(1, student.getStuid());
		pstmt.executeUpdate();
		if(con !=null)
		{
			con.close();
		}
	}
	
	public void doQuery() throws ClassNotFoundException, SQLException{
		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM tblstudent");
		ResultSet  rss = pstmt.executeQuery();
		while(rss.next()){
			System.out.println(rss.getInt("stuid")+" "+rss.getString("stuname"+" "+rss.getString("sex")+" "+rss.getString("email")+" "+rss.getString("phone")+" "+rss.getInt("score")));
		}
		if(con !=null)
		{
			con.close();
		}
	}
	

}

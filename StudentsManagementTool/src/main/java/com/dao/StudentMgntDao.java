package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentMgntDao {
	private String url = "jdbc:mysql://localhost:3306/student_mgnt";
	private String username = "root";
	private String password = "root";

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into studInfo (id ,name, city) values (8,'shubham','pune') ");
		System.out.println("inserted Succesfully....");
		
		stmt.close();
		con.close();
	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("update studInfo set name='patil' where id=8");
		System.out.println("inserted Succesfully....");
		stmt.close();
		con.close();
	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from studInfo where id=8; ");
		System.out.println("deleted Succesfully....");
		
		stmt.close();
		con.close();
	}

	public void selectData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from studInfo");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String city=rs.getString("city");
			
			System.out.println("id = "+id+" name = "+name+" city = "+city);
		}
		System.out.println("______________________________________________________________");
		
		stmt.close();
		con.close();
	}

}

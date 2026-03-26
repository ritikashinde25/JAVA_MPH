package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/mlamarch";
		
		String user = "root";
		
		String pas = "password";
		
		try
		{
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, user, pas);
			
			Statement stmt = con.createStatement();
			
			String sql = "create table employee(id int, e_name varchar(50), company varchar(50))";
			
			stmt.execute(sql);
			
			System.out.println("Done.");
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}

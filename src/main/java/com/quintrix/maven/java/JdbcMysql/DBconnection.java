package com.quintrix.maven.java.JdbcMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static String dbhost = "jdbc:mysql://localhost:3306/students";
	private static String username = "root";
	private static String password = "Pa$$w0rd";
	private static Connection conn;
	

	@SuppressWarnings("finally")
	public static Connection createNewDBconnection() {
		try  {	
			conn = DriverManager.getConnection(
					dbhost, username, password);	
		} catch (SQLException e) {
			System.out.println("Cannot create database connection");
			e.printStackTrace();
		} finally {
			return conn;	
		}		
	}
}

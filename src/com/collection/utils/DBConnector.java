package com.collection.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	private final static String USER = "ramya";
	private final static String PASSWORD = "rajes462";
	private final static String DB_URL = "jdbc:mysql://designerinstance.craqoxzg5rkj.us-west-2.rds.amazonaws.com:3306/designer";
	
	public static Connection connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("Error in loading driver" + e.getMessage());
		}
		
		Connection con = null;
		
		try{
			con = DriverManager.getConnection(DB_URL,USER, PASSWORD);
			System.out.println("Connection Successful");
		}catch(SQLException e){
			e.printStackTrace();
			System.err.println("Error in getting connection" + e.getMessage());
		}
		
		return con;
	}
	
	public static void main(String[] args){
		DBConnector.connect();
	}
	
}

package com.vineet;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");

			if(conn != null) {
				System.out.println("connected");
			}
			else {
				System.out.println("not connected");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

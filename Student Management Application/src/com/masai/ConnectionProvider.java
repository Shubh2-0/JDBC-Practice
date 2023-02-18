package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection connect;
	
public static Connection CreateConnection(){

	
//STEPS FOR CREATEING THE CONNECTION :-


	
	try {
		
		/*	LOAD THE DRIVER CLASS (STEP - 1) */		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/* CREATE THE CONNECTION (STEP - 2) */
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:/student_management";
		
		connect = DriverManager.getConnection(url,user,password);
		
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	
    
	return connect;
	
	
}


	
	
}

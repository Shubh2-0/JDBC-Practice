package com.masai.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {

 static final String url;	
 static final String username;
 static final String password;
	// 
 
/*  here we getting the required things for connect to the database
    by the help of RESOURCEBUNDLE CLASS in which we getting the
    URL , PASSWORD , USERNAME that we gave in the DB_Deatils 
    properties file.
    
    properties file -> store the data or information in the form of KEY VALUE pare 
    so we can easily use this file when we required.
    FOR EXAMPLE : storing the userName , password , URL for 
    connection to the data base
      
 */
 
static {	
   ResourceBundle bundle = ResourceBundle.getBundle("DB_Details");  
   url = bundle.getString("url");
   username = bundle.getString("username");
   password = bundle.getString("password");
}

/* load the DRIVER class into our project
   DRIVER CLASS -> This class is basically helpful to connect the database
 */
static {
	
//	THROW A EXCEPTION IF CLASS ARE NOT FOUND 
	try {
     
	Class.forName("com.mysql.cj.jdbc.Driver");	
		
		
	} catch (ClassNotFoundException e) {
     
		e.printStackTrace();
	}
	
	
}


// MTHOD FOR CONNECTING TO THE DATABASE
public static Connection connectToDatBase() {
	
	try {
		return DriverManager.getConnection(url,username,password);
	} catch (SQLException e) {
       
		e.printStackTrace();
	}
	return null;
	
}

// MTHOD FOR CLOSING THE CONNECTION TO THE DATABSE
public static void closeTheConnection(Connection con) throws SQLException{
	

		if(con!=null)
			con.close();	
}



//
//public static void main(String[] args) {
//
//	System.out.println(url);
//	System.out.println(password);
//	System.out.println(username);
//	
//	System.out.println(connectToDatBase());
//	
//	
//}


	
}

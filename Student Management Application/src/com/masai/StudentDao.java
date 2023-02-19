package com.masai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class StudentDao {
	
	static Connection con;
	static int n = 0;
	
	public static void insertStudentToDB(Student st) {

//	JDBC CODE FOR INSERTING STUDENT INTO DATABASE
	
	try {
		 con = ConnectionProvider.CreateConnection();
		
		String query = "insert into students(student_name,phone,city) values(?,?,?)";

//	PREPARED STATEMENT FOR INSERTING
		PreparedStatement preparedStatement = con.prepareStatement(query);
		
//	SET THE VALUES OF PARAMETER
		preparedStatement.setString(1, st.getStudentName());
		preparedStatement.setString(2, st.getStudentPhone());
		preparedStatement.setString(3, st.getStudentCity());
		

			int value = preparedStatement.executeUpdate();
			
			if(value > 0) {
				System.out.println("\n\n"+st.getStudentName()+" Added Successfully in DataBase 😃\n\n");
			}							
			
		} catch (Exception e) {
			
		}
		
		
 
		
		
       		
	}
    

	public static void deleteStudentFromDb(int rollNo) {
	
	try {
		con = ConnectionProvider.CreateConnection();
		
		String qr = "DELETE FROM STUDENTS WHERE student_id = ?";
		
		PreparedStatement pr = con.prepareStatement(qr);
		
		pr.setInt(1, rollNo);
		
		n = pr.executeUpdate();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
	if(n>0) {
		System.out.println("\n\nRecord Deleted\n\n");	
	}else {
		System.out.println("Please provide valid student id");
	}
	
		
		
	}
	
	
	public static void showAllRecords() {
	
	try {
		con = ConnectionProvider.CreateConnection();
		
		String qr = "SELECT * FROM STUDENTS";
	    Statement state = con.createStatement();
	    
	    ResultSet result = state.executeQuery(qr); 
	    
	    System.out.println("\n\n=====================ALL RECORDS===================");
	    
	    
	    while(result.next()) {
	    
	    	int id = result.getInt(1);
	    	String name = result.getString(2);
	    	String mobile = result.getString(3);
	    	String city = result.getString(4);
	    	
	    	System.out.println(" "+id+"\t"+name+"\t"+mobile+"\t"+city);
	    		
	    }
	    
	    System.out.println("=====================================================\n\n");
		
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
	}
	
}

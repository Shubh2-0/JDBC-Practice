package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.masai.DTO.Student;
import com.masai.EXCEPTIONS.Record_Not_Found_Exception;
import com.masai.EXCEPTIONS.Something_Went_Wrong_Exception;
import com.mysql.cj.protocol.Resultset;

public class StudnetDAO_IMPL implements StudentDAO {

	static Connection con = null;
	@Override
	public void addStudent(Student st) throws Something_Went_Wrong_Exception {
	try {
	
//	GETTING THE CONNECTION
	con = DBUtils.connectToDatBase();
	
//	PREPARING OF SQL QUERY FOR INSERTING DATA INTO student_table 
	String INSERT_QUERY = "INSERT INTO student_table(name,city,mobile_number,10th_percentage,status,current_marks) VALUES(?, ?, ?, ?, ?, ?)";
	PreparedStatement pr = con.prepareStatement(INSERT_QUERY);
	
//	SETTING VALUE FOR THE QUERY PARAMETER
	pr.setString(1, st.getName());
	pr.setString(2, st.getCity());
	pr.setString(3, st.getMobileNumber());
	pr.setBigDecimal(4, st.getX_Percentage());
	pr.setString(5, st.getStatus());
	pr.setInt(6, st.getCurrentMarks());
	
	int n = pr.executeUpdate();
	
	if(n>0) {
		System.out.println("\n\nRECORD SUCCESSFULLY ADDED TO DATABASE 😊\n\n");
	}else {
		System.out.println("THERE ARE SOME ISUE NOT ABLE TO ADD "+st.getName()+" INTO DATABASE 😥 PLEASE TRY AGAIN");
	}
		
		
	} catch (Exception e) {
		
		new Something_Went_Wrong_Exception("SOMETHING WENT WRONG 😥");
	
		
	} finally {
		
	   try {
		   DBUtils.closeTheConnection(con);
	} catch (Exception e2) {
		throw new Something_Went_Wrong_Exception("SOMETHING WENT WRONG");
	}
		
		
		
		
		
	}
 	
	
		

	}
	
	
	

	@Override
	public void updateStudent(Student st) throws Something_Went_Wrong_Exception, Record_Not_Found_Exception {
	
		try {
		
			con = DBUtils.connectToDatBase();
		
  String UPDATE_QUERY = "UPDATE student_table set name=?,city=?,"
  		+ "mobile_number=?,10th_percentage=?,"
  		+ "status=?,current_marks=? "
  		+ "WHERE idNumber=?";	
			
		PreparedStatement pr = con.prepareStatement(UPDATE_QUERY);
		pr.setString(1, st.getName());
		pr.setString(2, st.getCity());
		pr.setString(3, st.getMobileNumber());
		pr.setBigDecimal(4, st.getX_Percentage());
		pr.setString(5, st.getStatus());
		pr.setInt(6, st.getCurrentMarks());
		pr.setInt(7, st.getStudentID());
		
			
		int n = pr.executeUpdate();
		
		if(n > 0 ) System.out.println("\n\nSTUDENT UPDATED SUCCESSFULLY 😃😃\n\n");
		else throw new Record_Not_Found_Exception("RECORD NOT FOUND IN DATABASE FOR STUDENT ID : "+st.getStudentID());
			
		} catch (Exception e) {
			
		new Something_Went_Wrong_Exception("SOMETHING WENT WRONG");
			
 		} finally {
			
 			
 			try {
				DBUtils.closeTheConnection(con);
			} catch (Exception e2) {
				
			}
 		   	
 			
		};
		
		
		
		

	}

	@Override
	public void deleteStudent(int studentID) throws Record_Not_Found_Exception, Something_Went_Wrong_Exception {
	
		try {
			con = DBUtils.connectToDatBase();
			
			String DELETE_QUERY = "DELETE FROM student_table WHERE idNumber = ?";
			
			PreparedStatement pr = con.prepareStatement(DELETE_QUERY);
			
			pr.setInt(1, studentID);
			
			int n = pr.executeUpdate();
			
			if(n==1) System.out.println("\n\nRECORD DELETED SUCCESSFULLY 😊😊\n\n");
			
			else throw new Record_Not_Found_Exception("THERE ARE NO RECORD IN THE DATABSE WHERE STUDENT ID IS "+studentID);
			
		} catch (Exception e) {
			
			
			new Something_Went_Wrong_Exception("SOME WENT WRONG PLEASE TRY AGAIN");
		
			
			
		}
		
		
		

	}

	
	@Override
	public void getstudent(int studentId) throws Record_Not_Found_Exception, Something_Went_Wrong_Exception {
	
		try {
			
			con = DBUtils.connectToDatBase();
			
			String SELECT_ONE_RECORD_QUERY = "SELECT * FROM student_table WHERE idNumber = ?";
			PreparedStatement pr = con.prepareStatement(SELECT_ONE_RECORD_QUERY);
			
			pr.setInt(1, studentId);
			
			ResultSet resultset = pr.executeQuery();
			
			if(resultset==null) {
			
				throw new Record_Not_Found_Exception("THERE ARE NO RECORD IN DATABASE WHICH HAVE STUDENT ID : "+studentId);
				
			}else {
			   
			while(resultset.next())
				System.out.println(
				"\n\nRoll Number : "+resultset.getInt(1)+
				"\nName : "+resultset.getString(2)+
				"\nCity : "+resultset.getString(3)+
				"\nMobile Number : "+resultset.getString(4)+
				"\n10th Percentage : "+resultset.getBigDecimal(5)+
				"\nStatus : "+resultset.getString(6)+
				"\nCurrent Marks : "+resultset.getInt(7)+"\n\n");  
						
						
						
						
			
				
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
		
			throw new Something_Went_Wrong_Exception("SOMETHING WENT WRONG PLEASE TRY AGAIN");
		}
		
		

	}

	@Override
	public void showRecords() throws Record_Not_Found_Exception, Something_Went_Wrong_Exception {
    
		try {
		
			con = DBUtils.connectToDatBase();
			
			String SELECT_ALL_QUERY = "SELECT * FROM student_table";
			PreparedStatement pr = con.prepareStatement(SELECT_ALL_QUERY);
			
			ResultSet resultSet = pr.executeQuery();
			
			if(resultSet==null) {
				throw new Record_Not_Found_Exception("NO RECORD FOUND IN DATABSE");
			}else {
			
				System.out.println("\n\n=========================================================ALL STUDENTS RECORD=========================================================");
			
			while(resultSet.next()) {
			
//			System.out.println("\t"+
//					resultSet.getInt(1)+"\t"+
//			        resultSet.getString(2)+"\t\t"+
//					resultSet.getString(3)+"\t\t"+
//			        resultSet.getString(4)+"\t\t"+
//					resultSet.getBigDecimal(5)+"\t\t"+
//			        resultSet.getString(6)+"\t\t"+
//					resultSet.getInt(7)+"\t"
//					);	
//				
			System.out.printf("| %-5s | %-5s | %-5s | %-5s | %-8s | %-4s | %-4s",
					resultSet.getInt(1)+"\t",
			        resultSet.getString(2)+"\t\t",
					resultSet.getString(3)+"\t\t",
			        resultSet.getString(4)+"\t\t",
					resultSet.getBigDecimal(5)+"\t\t",
			        resultSet.getString(6)+"\t\t",
					resultSet.getInt(7)+"\t\n"
					);	
			}
			
			
			
			
				
			System.out.println("======================================================================================================================================\n\n");				
			}
			
			
			
			
			
		} catch (Exception e) {
			
			throw new Something_Went_Wrong_Exception("SOME WENT WRONG PLEASE TRY ARAIN");
			
		}
		
		

	}

}

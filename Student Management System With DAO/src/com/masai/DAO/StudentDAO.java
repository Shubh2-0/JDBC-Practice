package com.masai.DAO;

import com.masai.DTO.Student;
import com.masai.EXCEPTIONS.Record_Not_Found_Exception;
import com.masai.EXCEPTIONS.Something_Went_Wrong_Exception;

public interface StudentDAO {

void addStudent(Student st)throws Something_Went_Wrong_Exception;
void updateStudent(Student st) throws Something_Went_Wrong_Exception , Record_Not_Found_Exception;
void deleteStudent(int studentID) throws Record_Not_Found_Exception , Something_Went_Wrong_Exception;
void getstudent(int studentId) throws Record_Not_Found_Exception , Something_Went_Wrong_Exception;
void showRecords() throws Record_Not_Found_Exception , Something_Went_Wrong_Exception;

	
	
	
}

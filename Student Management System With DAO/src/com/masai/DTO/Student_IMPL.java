package com.masai.DTO;

import java.math.BigDecimal;

public class Student_IMPL implements Student{

private String name;
private String city;
private String mobileNumber;
private BigDecimal X_Percentage;
private String status;
private int currentMarks;
private int studentID;



public Student_IMPL() {
}



public Student_IMPL(String name1, String city, String mobileNumber, BigDecimal x_Percentage, int currentMarks) {
	this.name = name1;
	this.city = city;
	this.mobileNumber = mobileNumber;
	this.X_Percentage = x_Percentage;
	this.currentMarks = currentMarks;
	if(this.currentMarks > 300) {
		this.status = "PASS";
	}else {
		this.status = "FAIL";
	}
	
}



public Student_IMPL(String name, String city, String mobileNumber, BigDecimal x_Percentage, int currentMarks,int studentID) {
	this.name = name;
	this.city = city;
	this.mobileNumber = mobileNumber;
	X_Percentage = x_Percentage;
	if(this.currentMarks > 300) {
		this.status = "PASS";
	}else {
		this.status = "FAIL";
	}
	this.currentMarks = currentMarks;
	this.studentID = studentID;
}





public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getMobileNumber() {
	return mobileNumber;
}



public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}



public BigDecimal getX_Percentage() {
	return X_Percentage;
}



public void setX_Percentage(BigDecimal x_Percentage) {
	X_Percentage = x_Percentage;
}



public String getStatus() {
	return status;
}



public void setStatus(String status) {
	this.status = status;
}



public int getCurrentMarks() {
	return currentMarks;
}



public void setCurrentMarks(int currentMarks) {
	this.currentMarks = currentMarks;
}



public int getStudentID() {
	return studentID;
}



public void setStudentID(int studentID) {
	this.studentID = studentID;
}



@Override
public String toString() {
	return "Name: " + name + "\tCity: " + city + "\tMobile Number: " + mobileNumber + "\t10th Percentage: "
			+ X_Percentage + "\tStatus: " + status + "\tCurrent Marks: " + currentMarks + "Student ID: " + studentID + "\n";
}







	
	
	
}



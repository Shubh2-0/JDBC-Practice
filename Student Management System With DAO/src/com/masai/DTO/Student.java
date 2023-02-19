package com.masai.DTO;

import java.math.BigDecimal;

public interface Student {
 
	public String getName();
	public void setName(String name);
	
	public String getCity();
	public void setCity(String city);
	
	public String getMobileNumber();
	public void setMobileNumber(String mobileNumber);
	
	public BigDecimal getX_Percentage();
	public void setX_Percentage(BigDecimal x_Percentage);
	
	public String getStatus();
	public void setStatus(String status);
	
	public int getCurrentMarks();
	public void setCurrentMarks(int currentMarks);

	public int getStudentID();
	public void setStudentID(int studentID);

	
}

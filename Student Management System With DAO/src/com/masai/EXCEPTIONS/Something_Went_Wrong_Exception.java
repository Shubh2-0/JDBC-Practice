package com.masai.EXCEPTIONS;

public class Something_Went_Wrong_Exception extends Exception{

	public Something_Went_Wrong_Exception(String e){
	
		super(e);
		
	}

	@Override
	public String toString() {
		return getMessage();	
		
	}
	
	
	
}

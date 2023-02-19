package com.masai.EXCEPTIONS;

public class Record_Not_Found_Exception extends Exception {

	public Record_Not_Found_Exception(String e){
		super(e);
	}

	@Override
	public String toString() {
		return getMessage();
	}
	
	
	
	
}

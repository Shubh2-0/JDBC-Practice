package com.masai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
	System.out.println("😁 Welcome To Student Management App 👨‍💻");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		
	System.out.println("PRESS 1 to ADD student");
    System.out.println("PRESS 2 to Delete student");
    System.out.println("PRESS 3 to display student");
    System.out.println("PRESS 4 to exit app");
    
    int c = Integer.parseInt(br.readLine());
	
    if(c==1) {
//    ADD STUDENT INTO DATABASE
    System.out.print("Enter student name ➡️ ");
    String name = br.readLine();
    
    System.out.print("Enter student phone number ➡️ ");
    String phone = br.readLine();
    
    System.out.print("Enter student city ➡️ ");
    String city = br.readLine();
    
//    CREATE STUDENT OBJECT TO STORE THIER INFORMATION
    Student st = new Student(name, phone, city);
    
    StudentDao.insertStudentToDB(st);
    
    
    }
    
    else if(c==2) {
    	
    System.out.print("Enter Student ID ➡️ ");
    int id = Integer.parseInt(br.readLine());
    
    StudentDao.deleteStudentFromDb(id);
    
    	
    	
    }
    
    else if(c==3) {
    	
    	StudentDao.showAllRecords();
    	
    }
    
    else if(c==4) {
    	
    System.out.println("Thankyou for using the app 😊😊j VIST AGAIN 😊😊");
    	
    	break;
    }
    
    else {
    	
    	System.out.println("Invalid Choice! Please try again 🤝\n\n");
    	
    }
    
    
	}
	
	
		
	}
	
	
}

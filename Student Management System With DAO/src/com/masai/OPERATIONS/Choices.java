package com.masai.OPERATIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

import com.masai.DAO.StudentDAO;
import com.masai.DAO.StudnetDAO_IMPL;
import com.masai.DTO.Student;
import com.masai.DTO.Student_IMPL;

public class Choices {

static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
static String BLACK ="\u001B[30m";
static String RED ="\u001B[31m";	
static String GREEN ="\u001B[32m";	
static String YELLOW ="\u001B[33m";	
static String BLUE ="\u001B[34m";	
static String PURPLE ="\u001B[35m";	
static String CYAN ="\u001B[36m";	
static String WHITE ="\u001B[37m";	
	
public static void choiceOne() throws NumberFormatException, IOException {

System.out.println("FOR ADDING A NEW STUDENT INTO DATABSE PLEASE PROVIDE SOME INFORMATION ABOUT THAT STUDENT");


System.out.print("Enter Name :");
String name = reader.readLine();



System.out.print("Enter City :");
String city = reader.readLine();

System.out.print("Enter Mobile Number :");
String number = reader.readLine();

System.out.print("Enter 10th Percentage :");
double t = Double.parseDouble(reader.readLine());  
BigDecimal percentage = BigDecimal.valueOf(t);

System.out.print("Enter Current Marks :");
int currentMarks = Integer.valueOf(reader.readLine());



Student st = new Student_IMPL(name, city, number, percentage,currentMarks);

try {
	StudentDAO operations = new StudnetDAO_IMPL();
	operations.addStudent(st);
} catch (Exception e) {
   e.printStackTrace();
}


}


public static void choiceTwo() throws NumberFormatException, IOException {

System.out.println("FOR UPDATING A STUDENT PLEASE PROVIDE SOME INFORMATION ABOUT THAT STUDENT");


System.out.print("Enter Name :");
String name = reader.readLine();

System.out.print("Enter City :");
String city = reader.readLine();

System.out.print("Enter Mobile Number :");
String number = reader.readLine();

System.out.print("Enter 10th Percentage :");
double t = Double.parseDouble(reader.readLine());  
BigDecimal percentage = BigDecimal.valueOf(t);

System.out.print("Enter Current Marks :");
int currentMarks = Integer.valueOf(reader.readLine());

System.out.print("Enter Student ID :");
int id = Integer.valueOf(reader.readLine());

Student st = new Student_IMPL(name, city, number, percentage,currentMarks,id);

try {
	StudentDAO operations = new StudnetDAO_IMPL();
	operations.updateStudent(st);
} catch (Exception e) {
   e.printStackTrace();
}


}



public static void choiceThree() throws NumberFormatException, IOException {

System.out.println("FOR DELETING A STUDENT FROM DATABASE PLEASE PROVIDE STUDENT ID");

System.out.print("Enter Student ID :");
int id = Integer.valueOf(reader.readLine());

try {
	StudentDAO operations = new StudnetDAO_IMPL();
	operations.deleteStudent(id);
} catch (Exception e) {
   e.printStackTrace();
}


}	

public static void choiceFour() throws NumberFormatException, IOException {

System.out.println("FOR GETTING A PARTICULAR STUDENT RECORD FROM DATABASE PLEASE PROVIDE STUDENT ID");

System.out.print("Enter Student ID :");
int id = Integer.valueOf(reader.readLine());

try {
	StudentDAO operations = new StudnetDAO_IMPL();
	operations.getstudent(id);
} catch (Exception e) {
   e.printStackTrace();
}


}	

public static void choiceFive(){

try {
	StudentDAO operations = new StudnetDAO_IMPL();
    operations.showRecords();
} catch (Exception e) {
   e.printStackTrace();
}

}

public static void Exit() {
	System.out.println("Thankyou 🫰 for using our service Visit Again🫶");
}
	
	
	
	
}

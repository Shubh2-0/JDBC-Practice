package com.masai.UI;
import java.io.IOException;
import java.util.Scanner;
import com.masai.OPERATIONS.Choices;

public class UI_Main {
	
public static void main(String[] args) throws NumberFormatException, IOException {

String BLACK ="\u001B[30m";
String RED ="\u001B[31m";	
String GREEN ="\u001B[32m";	
String YELLOW ="\u001B[33m";	
String BLUE ="\u001B[34m";	
String PURPLE ="\u001B[35m";	
String CYAN ="\u001B[36m";	
String WHITE ="\u001B[37m";	
   	    
	
System.out.println(GREEN+"\t\tWELCOME TO STUDENT MANAGEMENT APP 😊😊\n\n");
int choice;
Scanner sc = new Scanner(System.in);
do {
System.out.println("\t\tPRESS 1️ FOR ADD STUDENT\n\n"
		+ "\t\tPRESS 2 FOR UPDATE STUDENT RECORD\n\n"
		+ "\t\tPRESS 3 FOR DELETE STUDENT RECORD\n\n"
		+ "\t\tPRESS 4 FOR GET ANY PARTICULAR STUDENT RECORD FROM STUDENT ID\n\n"
		+ "\t\tPRESS 5 FOR ALL RECORDS\n\n"
		+ "\t\tPRESS 6 FOR EXIT\n\n");
choice = sc.nextInt();

if(choice==1) {
	
	Choices.choiceOne();
}
  else if(choice==2) {
	  
	Choices.choiceTwo();
	
}
  else if(choice==3) {
	  
	Choices.choiceThree();
	
}
  else if(choice==4) {
	  
	Choices.choiceFour();
	
}
  else if(choice==5) {
	  
	  Choices.choiceFive();
} 
  else if(choice==6) {
	  
	  Choices.Exit();
	  break;
}
 
  else {
	  
	  System.out.println("INVALID SELECTION PLEASE CHOOSE ANY OF THE ABOVE");
	  
  }

   

   
  
	
	
	
	
	
	
}while(true);



	
	
	
	
}


}

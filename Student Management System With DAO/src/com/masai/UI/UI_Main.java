package com.masai.UI;
import java.io.IOException;
import java.util.Scanner;
import com.masai.OPERATIONS.Choices;

public class UI_Main {
	
public static void main(String[] args) throws NumberFormatException, IOException {

System.out.println("WELCOME TO STUDENT MANAGEMENT APP 😊😊");

int choice;
Scanner sc = new Scanner(System.in);
do {
System.out.println("PRESS 1 FOR ADD STUDENT\n"
		+ "PRESS 2 FOR UPDATE STUDENT RECORD\n"
		+ "PRESS 3 FOR DELETE STUDENT RECORD\n"
		+ "PRESS 4 FOR GET ANY PARTICULAR STUDENT RECORD FROM STUDENT ID\n"
		+ "PRESS 5 FOR ALL RECORDS\n"
		+ "PRESS 6 FOR EXIT");
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

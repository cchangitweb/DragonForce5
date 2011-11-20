// keyboard input
import java.util.Scanner;
// array of objects
import java.util.ArrayList;
// write and read file
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBook {
// JR START 
private int functionChoice;
    
// HC START 
public AddressBook() {
// default constructor: create an array of object type Contact and create menu
ArrayList<Contact> addressList = new ArrayList<Contact>();
System.out.println("Constructor AddressBook() called.");
}

public void run(){
this.chooseFunction();
// testing each methods by for loop, later chooseFunction will prompt user to enter 
// which function s/he wants
    for (int i=0; i<7; i++)
    {
    	switch(i){
    	case 0:
    		this.newContact();
    		break;
    	case 1:
    		this.printAllContacts();
    		break;
    	case 2:
    		this.retrieveLastName();
    		break;
    	case 3:
    		this.retrieveEmail();
    		break;
    	case 4:
    		this.retrieveZipCode();
    		break;
    	case 5:
    		this.deleteContact();
    		break;
    	default:    	  
    }}
}

//JR START 
public void chooseFunction(){
System.out.println("Function Menu Called");
/* contains the table of contents that allows the user to choose
   which function they wish to do
1. Prompt that asks users to select a function
2. User enters which function they'd like to do
3. If function choice is 7 then program ends
*/
}

// HC START
public void printAllContacts(){
// print all contacts in the addressbook
System.out.println("Method printAllContacts() called.");
   }

// JR START 
public void newContact(){
System.out.println("newContact function Called");
/*  
1. User is asked to enter
	    A. first name 
        B. last name 
        C. street address 
        D. email address 
        E. phone number 
        F. notes
2. User enters their contacts
     	A. first name entered 
        B. last name entered 
        C. street address entered
        D. email address entered 
        E. phone number entered
        F. notes
Alternate courses: If the user leaves one or more of the fields blank,
                   the person will still be entered into the contact list.
Exception course: If the user leaves the last name blank, then the person will
                  not be entered into the contact list.
3.The new person is saved to memory. When the user quits the program,
  the new person is saved to disk with the rest of the contacts.  
4.Program returns the user to the function menu
*/
}

public void deleteContact(){
System.out.println("deleteContact function called");
/* 	 
1.  The  user  is prompted to enter a single person's last name
2.  The user enters the last name of the person to be deleted
3.  The system retrieves  a  single  person  by  last  name and prints that contact to the screen
4.  The  user  is asked if they want  to  delete  this  person (Yes or No)   
5.  The user inputs their confirmation (Yes or No) 	 
6.  The  system  sets all value of this contact object to null
7.  The system prints the message "Contact deleted" to the screen
8.  The user is returned to the choseFunction menu 	 
Alternate  courses:  When  asked  for  confirmation, if  the  user  does  not  confirm  the  delete,  then  the  system  does  not  
                  	delete  the   person's  record.   

Exception  course:  After  completing  this  use  case,  if  the  user  asks  to  undo  the   delete, the  system  is  not  able  to  undo  it.   	
Execption: ( in step 3)if there are multiple people with the same last name, the computer asks which contact is to be deleted by first name..	 
*/
}

//CM START
public void retrieveZipCode() {
System.out.println("retrieveZipCode called");
/*
1. Asks the user to enter a zip code (output)
2. User enters zip code (input)
3. Searches through ContactList Array for objects with the entered zip code
a. Prints out contact information of person with the entered zipcode
4. Asks user if they would like to continue searching for users by their zip code
5. If so - continue
6. else - return to project menu
*/
}

public void retrieveEmail() {
System.out.println("retieveEmail called");
/*
1. Asks the user to enter a email
2. User enters email
3. Searches through ContactList Array for objects with the entered email
a. Prints out name of the person with the email
4. Asks user if they would like to continue searching for users by their zip code
5. if so - continue
6. else return to project menu
*/
}

public void retrieveLastName() {
System.out.println("retrieveLastName() called");
/*
1. Asks the user to input a last name
2. User enters last name
3. Searches through ContactList Array for objects with the entered last name
a. Prints out all the names of the people with the entered last name
4. Asks user if they would like to continue searching for users by their last name
5. If so - continue
6. else - return to project menu
*/
}
}

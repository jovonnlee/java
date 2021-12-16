/**
 * This program is meant to take a file and convert into a list of phone book entries.  Each entry contains 
 * first name last name home number office number and email.  The program begins with a start menu with
 * the options of adding a contact printing the phonebook sorting the pgonebook by first or last name and
 * searching the phone book by lastname.
 * @author Jovonn Lee
 * @version 12.4.21
 */

package main;

import java.io.*;
import java.util.*;

public class Phonebook{
	  public ArrayList<Contact> contacts = new ArrayList<>();
	  /**************************************************************************
		 * Main method that calls the phonebook start up method
		 * @param args
		 * @throws FileNotFoundException
		 */

	  public Phonebook(String file) throws FileNotFoundException{
	    // create arraylist of contacts by reading data from the file
	    Scanner scan = new Scanner(new File(file));
	    
	    String token[];
	    while(scan.hasNextLine()){
	      token = scan.nextLine().split(",");
	      if(token[2].equals("-")){
	        token[2] = "0";
	      }
	      if(token[3].equals("-")){
	        token[3] = "0";
	      }
	      contacts.add(new Contact(token[0],token[1],Long.parseLong(token[2]),Long.parseLong(token[3]),token[4]));
	      

	    }
	  }
	   /**
	    * method for adding contacts to phonebook        
	    * @param c
	    */
	  public void add(Contact c){
	    // add contact to the array list.
	    contacts.add(c);
	  }
	  /**
	   * method for displaying all of phonebook
	   */

	  public String toString(){
		    //returns the entire phone book as string
		    System.out.printf("FirstName    LastName     HomeNumber   OfficeNumber    EmailAddress\n");
		    for(Contact c: contacts){
		      System.out.printf("%-12s %-12s %-12d %-15d %-11s%n", c.getFirst(), c.getLast(), c.getHomeNum(), c.getOfficeNum(), c.getEmail());
		    }
		    return "";
		  }
	  /**
	   * method to sort phonebook by first name
	   */
	 
	  public void bubbleSort(){
	    //Sort phonebook by first name
	    Contact temp;
	     for(int j = 0;j< contacts.size();j++){
	       for(int i =j+1;i< contacts.size();i++){
	         if(contacts.get(i).getFirst().compareToIgnoreCase(contacts.get(j).getFirst())<0){
	           temp = contacts.get(j);
	           contacts.set(j,contacts.get(i));
	           contacts.set(i,temp);
	         }
	       }
	     }    
	    }
	  /**
	   * method for sorting phone book by last name
	   */

	  public void selectionSort(){
	    //Sort phone book by last using selection sort algorithm.
	    Contact temp;
	     for(int j = 0;j< contacts.size()-1;j++){
	       int min = j;
	       for(int k =j+1;k< contacts.size();k++){
	         if(contacts.get(k).getLast().compareToIgnoreCase(contacts.get(min).getLast())<0){
	           min = k;
	         }
	         temp = contacts.get(j);
	         contacts.set(j,contacts.get(min));
	         contacts.set(min,temp);
	       }
	     }    
	  }
	  
	  /**
	   * method for searching phonebook by contact last name.  Returns contact info if found
	   * @param name
	   * @return found
	   * @return notFound
	   */
	  public String binarySearch(String name){
	    // Search contact by last name using binary search. 
	    // return true if contact is found else false
	    String found = "Contact found";
	    String notFound = "Contact not found";
	    int min = 0, max = contacts.size()-1;
	    while (min <= max) {
	      int m = min + (max - min) / 2;
	      int res = name.compareToIgnoreCase(contacts.get(m).getLast());
	      // Check if x is present at mid
	      if (res == 0){
	        
	        System.out.println(contacts.get(m).toString());
	    	return found;
	      }
	      // If x greater, ignore left half
	      if (res > 0){
	        min = m + 1;
	      }
	      // If x is smaller, ignore right half
	      else{
	        min = m - 1;
	      }
	    }
	    System.out.println("Contact not found");
	    return notFound;
	  }

}

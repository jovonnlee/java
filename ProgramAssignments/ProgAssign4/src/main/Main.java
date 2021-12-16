package main;

import java.util.*;
import java.io.*;

public class Main {

	private static boolean running = true;
	  public static Phonebook Phonebook;

	  public static void main(String[] args) throws FileNotFoundException {
	    Phonebook = new Phonebook("ContactDetails.txt");
	    startUp();
	    
	  }
		/**
		 * Method for start up menu. Sends users to specific methods depending on choice in menu
		 */
		public static void startUp(){
			
			while (running){
				System.out.println("Phonebook Menu Options");
			    System.out.println();
			    System.out.println("Enter P to Print the phonebook");
			    System.out.println("Enter B to sort by first name");
			    System.out.println("Enter L to sort by last name");
			    System.out.println("Enter S to Search for a contact");
			    System.out.println("Enter A to add a contact");
			    System.out.println("Enter Q to Quit");
			    Scanner menu = new Scanner(System.in);
			    String input = menu.next();
			    input = input.toUpperCase();
			    switch (input){
			      case "P":
	            System.out.println("");
			    	  Phonebook.toString();
	            System.out.println("");
			      break;
			      case "B":
	            Phonebook.bubbleSort();
	            System.out.println("");
			      break;
			      case "L":
	            Phonebook.selectionSort();
	            System.out.println("");
			      break;
			      case "S":
	            System.out.print("Last Name: ");
			    	  Scanner search = new Scanner(System.in);
			    	  String search1 = search.next();
	            System.out.println("");
	            Phonebook.binarySearch(search1);
	            System.out.println("");
			      break;
			      case "A":
			    	  System.out.print("First Name: ");
			    	  Scanner add = new Scanner(System.in);
			    	  String first = add.next();
	            System.out.print("Last Name: ");
	            String last = add.next();
	            System.out.print("Home Number: ");
	            Long home = Long.valueOf(add.nextLong());
	            System.out.print("Office Number: ");
	            Long office = Long.valueOf(add.nextLong());
	            System.out.print("Email Address: ");
	            String email = add.next();
	            Phonebook.add(new Contact(first, last, home, office, email));
	            System.out.println("");
			      break;
			      case "Q":
			    	  System.out.println("Phonebook menu exiting.....goodbye!");
			    	  running = false;
			      break;
			      default:
			    	  throw new InputMismatchException("Incorrect input");
			    }

			}
			
			
		}

}

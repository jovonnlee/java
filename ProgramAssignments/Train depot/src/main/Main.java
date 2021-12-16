/********************************************************************************
 * This program is train depot,  efficiently order the train cars so that it is 
 * easy to attach and detach them. In this assignment, you will implement Train
 * Cars program that reads car details from the file called car.txt (given) and
 * stores them in a LinkedList data structure. Cars in the train are linked in 
 * a specific order. Each car in the train contains various materials that must 
 * be attached and detached in the most efficient manner possible. Each car 
 * (node of type Car) has a stop number, factory name, material name. 
 * @author Jovonn Lee
 * @version 11/14/21
 * */


package main;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.*;

public class Main {
	
	private static boolean running = true;
	private static Train train;
	
	/**************************************************************************
	 * Main method that calls the train start up method
	 * @param args
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		train = new Train("car.txt");
		startUp();
		

	}
	/************************************************************************
	 * Startup method that brings the startup menu into the console, allows 
	 * user to decide if they want to attach, detach, merge, search, or display
	 * the train cars.  Also allows user to quit.
	 * */
	public static void startUp(){
		
		while (running){
			System.out.println("Train Depot Menu Options");
		    System.out.println();
		    System.out.println("Enter A to Attach a train car");
		    System.out.println("Enter R to Detach a train car");
		    System.out.println("Enter D to Display all the train cars");
		    System.out.println("Enter S to Search a train car");
		    System.out.println("Enter M to Merge two train cars");
		    System.out.println("Enter Q to Quit");
		    Scanner menu = new Scanner(System.in);
		    String input = menu.next();
		    input = input.toUpperCase();
		    switch (input){
		      case "A":
		    	  System.out.print("Factory Name: ");							// requests a factory name stop number and material list for adding a train
		    	  Scanner add = new Scanner(System.in);
		    	  String add1 = add.nextLine();
		    	  System.out.print("Stop Number: ");
		    	  int add2 = add.nextInt();
		    	  System.out.print("Materials: ");
		    	  String add3 = add.next();
		    	  train.attach(add1,add2,add3);
		    	  System.out.println("Car added: "+add1+" "+add2+" "+add3);
		      break;
		      case "R":
		    	  System.out.print("Factory Name: ");							// requests a factory name used in detaching a car from the train
		    	  Scanner remove = new Scanner(System.in);
		    	  String remove1 = remove.next();
		    	  train.detach(remove1);
		      break;
		      case "D":
		    	  train.displayTrainCars();
		      break;
		      case "S":
		    	  System.out.print("Factory Name: ");							// requests a factory name then displays the cars in that factory plus their materials
		    	  Scanner search = new Scanner(System.in);
		    	  String search1 = search.next();
		    	  System.out.println("\nCars list: ");
		    	  train.search(search1);
		    	  System.out.println("\nMaterials list for "+search1);
		    	  System.out.println(train.getCars(search1)+"\n");
		      break;
		      case "M":
		    	  System.out.print("File Name: ");                               // requests a file name to merge another manifest of train cars
		    	  Scanner merge = new Scanner(System.in);
		    	  String merge1 = merge.next();
		    	  train.merge(merge1);
		      break;
		      case "Q":
		    	  System.out.println("Train depot menu exiting.....goodbye!");
		    	  running = false;
		      break;
		      default:
		    	  throw new InputMismatchException("Incorrect input");
		    }
		}
		
		
	}

}

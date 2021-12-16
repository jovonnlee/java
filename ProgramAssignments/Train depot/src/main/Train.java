package main;

import java.io.*;
import java.util.*;

public class Train {
	
	
	  private Car front;
	 
	  /***
	   * Initializes a train object and sets front to null
	   */
	  public Train(){
	    this.front=null;
	  }
	  
	  /***************************************************************************************************
	   * Initializes a Train object while taking a String as parameter which is the name of a file.
	   * This file is read within this constructor. Every object that is read in this constructor,
       * used in a call to the Attach method that adds Cars to the train. Originally the Train is not
	   * sorted, but the User will not know this because the list is sorted when the user asks to
	   * display the Cars.
	   * @param carFile
	   * 
	   * */
	  public  Train(String carFile) {
	   
	    Scanner fileReader = null;

	    try {
	      fileReader = new Scanner(new File("C:/Users/SimUser/workspace/Train depot/src/main/"+carFile));

	    }catch (FileNotFoundException e){
	      System.out.println("File Not Found");
	    }
	    String [] info;
	    String line;
	 

	    while (fileReader.hasNextLine()){
	      line = fileReader.nextLine();
	      info = line.split(",");
	     

	      attach(info[0],Integer.valueOf(info[1]),info[2]);
	    }

	    fileReader.close();


	  }
	  /**
	   * The attach method takes in three parameters and then adds the car to the end 
	   * of the list of cars with the information provided
	   * @param factoryName
	   * @param stopNumber
	   * @param materialName
	   * */
	  public void attach(String factoryName, int stopNumber, String materialName){
		    if (this.front == null) {
		      this.front = new Car(factoryName, stopNumber, materialName);
		    }
		    else{
		    	Car current = this.front;
		    	while (current.next !=null){
		    		current = current.next;
		    	}
		    	current.next = new Car(factoryName, stopNumber, materialName);
		    }
		    sort();
		  
	  }
	  /**
	   * The detach method takes a String factoryName that the user inputs, and then the
       * Train is search one item at a time until the Car with the factory name is found
       * Once found, the Car is then deleted, then the method is called again to find anymore
       * Cars that share the same factory name
       * @param factorvName
       **/
	  public void detach(String factoryName){
		  this.sort();
		    if (this.front == null) {
		      return;
		    }
		    Car current = this.front, prev = null;
		    
		    if (current!= null && current.factory.equalsIgnoreCase(factoryName)){
		      this.front = current.next;
		      current = null;
		      return;

		    }
		    while (current != null &&  !current.factory.equalsIgnoreCase(factoryName)){
		    	prev = current;
		    	current = current.next;

		    }
		    if (current!= null && current.factory.equalsIgnoreCase(factoryName)){
			      prev.next = current.next;
			      current = null;
			      detach(factoryName);
			      
		    }else {
		    	System.out.println("");
		    	System.out.println("Car/Cars has/have been detached");
		    }

		  }
	  /**
	   * This method iterates thru the list of train cars and displays them to the console.
	   **/
	  public void displayTrainCars(){
		    this.sort();

		    Car current = this.front;
		    

		    if (current == null) {
		      System.out.println("This train is empty");
		    }
		    while (current != null){
		    	System.out.println(current.factory + " " + current.stop + " " + current.material);	    	
		    	current = current.next;
		    }
		    System.out.println("");

		  }
	  /**
	   * This method takes in a parameter and searches thru the list of cars and returns the
	   * cars that match that parameter.
	   * @param factoryName
	   **/
	  public void search(String factoryName){
		    Car current = this.front;
		    if (current == null){
		    	System.out.println("There are no cars on the train");
		    	return;
		    }
		    while (current != null){
		    	if(current.factory.equalsIgnoreCase(factoryName)){
		    		System.out.println(current.factory + " " + current.stop + " " + current.material);
		    	}
		    	current = current.next;
		    }

		  }
	  /**
	   *This method takes in a parameter and returns all the materials associated with that
	   *car that has a stop at that factory.
	   *@param factoryName
	   *@return materials 
	   **/
	  public List<String> getCars(String factoryName){
		    List<String> materials = new LinkedList<>();

		    Car current = this.front;
		    while (current != null) {
		      if (current.factory.equalsIgnoreCase(factoryName)){
		    	  materials.add(current.material);
		      }
		      current = current.next;
		    }
		    
		    return materials;
	  }
	  /**
	   * This method takes in a file name, searches the location for the file, it then reads thru the file
	   * and adds each of the cars in the file, into the train.
	   * @param update
	   */
	  public void merge(String update){
		    Scanner fileReader = null;
		    String [] info = null;
		    String displayNew = null;
		    String line;

		    try {
		    	fileReader = new Scanner(new File("C:/Users/SimUser/workspace/Train depot/src/main/"+update));
		    } catch (FileNotFoundException e) {
		      System.out.println("File was not found!");
		    }

		    while (fileReader.hasNextLine()){
		      line = fileReader.nextLine();
		      info = line.split(",");

		      attach(info[0], Integer.valueOf(info[1]),info[2]);
		    }

		    fileReader.close();
		    System.out.println("New Cars added!");
		    sort();
		  }
	  /**
	   * This method sorts all the cars on the train and puts them in order of stops.
	   */
	  public void sort() {
		    Car current = this.front, index = null;
		    int temp;
		    String tempFactory, tempMaterial;

		    if (this.front == null) {
		      return;
		    } else {
		      while (current != null) {
		        index = current.next;

		        while (index != null) {
		          if (current.stop > index.stop) {
		            temp = current.stop;
		            tempFactory = current.factory;
		            tempMaterial = current.material;

		            current.stop = index.stop;
		            current.factory = index.factory;
		            current.material = index.material;

		            index.stop = temp;
		            index.factory = tempFactory;
		            index.material = tempMaterial;
		          }
		          index = index.next;
		        }
		        current = current.next;
		      }
		    }
		  }

}

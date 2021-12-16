package main;

public class Dragon extends MagicalCreatures{

	  /*
	  Constructor class to create the creature Dragon
	  @param the four attributes for the object are the name, the type 
	  of creature, the creature color, and the age of the creature
	  */
	  public Dragon(String name, String type, String color, int age){
	    
	   super(name,type,color, age);
	  }
	   public String toString(){
	    return super.toString() + " I breathe fire";
	  }
	  /*
	  Method to decide if the Dragon can kill other creatures.
	  Dragon must be over 40 years old to kill
	   */
	  public void kill(MagicalCreatures other){
	    if (age < 40){
	      System.out.println("I am too young to kill");
	    }else {
	      if (this.getName() == other.getName()){
	      System.out.println("I can't kill myself");
	    }
	      other.die();
	    }
	  }/*
	  Method to ensure that Dragons are not killed
	  */
	  public void die(){
	    this.alive = true;
	    System.out.println("I am a dragon - nobody gets to kill me !");
	  }
	  
	 
	  
	}

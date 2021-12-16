package main;

public class Goblin extends MagicalCreatures{

	  /*
	  Constructor class to create the creature elf
	  @param the four attributes for the object are the name, the type 
	  of creature, the creature color, and the age of the creature
	  */
	  public Goblin(String name,String type, String color, int age){
	   super(name, type, color, age);
	  }
	  public String toString(){
	    return super.toString()+ "I kill elves if they do not have shields";
	  }
	   /*
	  Method to kill other creatures and ensure that the elf doesnt kill itself
	  @param takes the other creature as a parameter to make sure its not itself
	  */
	  public void kill(MagicalCreatures other){
	    if (this.getName() == other.getName()){
	      System.out.println("I can't kill myself");
	    }
	  }
	  
	}

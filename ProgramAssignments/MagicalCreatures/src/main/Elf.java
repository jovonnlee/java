package main;

import java.util.*;
public class Elf extends MagicalCreatures{
  
  public boolean shield;
  /*
  Constructor class to create the creature elf
  @param the four attributes for the object are the name, the type 
  of creature, the creature color, and the age of the creature
  */
  public Elf(String name,String type, String color, int age){
   super(name, type, color, age);
   this.shield = false;
  }
  public String toString(){
    if(shield == true){
      return super.toString()+ "I eat leaves, I have a shield";
    }
    return super.toString()+ "I eat leaves, I have no shield";
  }
  /*Method to add a shield of protection for this creature
  @param takes a random number between 0 and 1*/
  public void setShield(int num){
    if (num == 1){
      this.shield = false;
    }else {
      this.shield =true;
    }
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
  /*
  Method that sets the boolean Alive to false
  */
  public void die(){
    Random rand = new Random();
    int num = rand.nextInt(2);
    setShield(num);
    if(this.shield == true){
      this.alive = true;
    }else{
      this.alive = false;
    }
  }

  
}

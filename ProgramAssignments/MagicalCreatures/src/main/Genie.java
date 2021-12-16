package main;

import java.util.*;
public class Genie extends MagicalCreatures{
  
  public boolean hasWand;
  /*
  Constructor class to create the creature elf
  @param the four attributes for the object are the name, the type 
  of creature, the creature color, and the age of the creature
  */
  public Genie(String name,String type, String color, int age){
   super(name, type, color, age);
   this.hasWand = false;
  }
  public String toString(){
    if(hasWand == true){
      return super.toString()+ "I eat leaves, I have a wand";
    }
    return super.toString()+ "I eat leaves, I have no wand";
  }
  /*
  Method that randomly gives Genie a want so that he can kill other creatures
  @param takes a random number between 0 and 1
  */
  public void setWand(int num){
     if (num == 1){
      this.hasWand = false;
    }else {
      this.hasWand =true;
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
    Random rand = new Random();
    int num = rand.nextInt(2);
    setWand(num);
    if (hasWand == false){
      System.out.println("I cannot kill without my wand!");
    }else if (hasWand== true){
      other.die();
    }

  }
  
}

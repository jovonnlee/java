package main;

public class MagicalCreatures {
	public String name;
	  public String type;
	  public String color;
	  public int age;
	  public boolean alive = true;

	  /*
	  Constructor class to create the creature Dragon
	  @param the four attributes for the object are the name, the type 
	  of creature, the creature color, and the age of the creature
	  */
	  public MagicalCreatures(String name, String type, String color,int age){
	    this.name =name;
	    this.type=type;
	    this.color=color;
	    this.age=age;
	  }
	  /*
	  Method to get the name of the creature
	  @return Creatures name
	  */
	  public String getName(){
	    return name;
	  }
	  /*
	  Method to get the name of the creature
	  @return Creatures name
	  */
	  public String getType(){
	    return type;
	  }
	  /*
	  Method to get the name of the creature
	  @return Creatures name
	  */
	  public String getColor(){
	    return color;
	  }
	  /*
	  Method to get the name of the creature
	  @return Creatures name
	  */
	  public int getAge(){
	    return age;
	  }
	  /*
	  Method to see if the creature is alive
	  @return true if the creature is alive and false if it is not
	  */
	  public boolean getAlive(){
	    return alive;
	  }
	  /*
	  Method to set the name of the creature
	  */
	  public void setName(String name){
	    this.name=name;
	  }
	  /*
	  Method to set the type of the creature
	  */
	  public void setType(String type){
	    this.type=type;
	  }
	  /*
	  Method to set the color of the creature
	  */
	  public void setColor(String color){
	    this.color = color;
	  }
	  /*
	  Method to set the age of the creature
	  */
	  public void setAge(int age){
	    this.age = age;
	  }
	  /*
	  Method to set creature to alive
	  */
	  public void setAlive(){
	    this.alive=true;
	  }
	  public void kill(MagicalCreatures other){
	    
	    System.out.println("I do not have the license to kill ");
	  }
	  /*
	  Method to kill creature
	  */
	  public void die(){
	    this.alive = false;
	  }
	  public String toString(){
	    return "My name is " + name +" I am a "+color+" " +type+" I am "+age +" years old ";
	  }

}

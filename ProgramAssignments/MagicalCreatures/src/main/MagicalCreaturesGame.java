package main;
import java.util.*;
import java.io.*;
/*****************************************************************************************
This program is designed to be a war game.  The program will take names, types, colors, 
and age from a text File it will separate those things into specific creatures with specific 
attributes. The game will then fight the creatures for a certain amount of specified rounds.
@author Jovonn Lee
@version October 24 2021
******************************************************************************************/

public class MagicalCreaturesGame {

	public static void main(String[] args) {
	    // Creates an ArrayList of Creature objects and a List of strings to hold all of the data from the txt File

	    List<String> MC = new ArrayList<String>();
	    ArrayList<MagicalCreatures> list = new ArrayList<MagicalCreatures>(); 
	    // Try catch statement that pulls data from the txt File   
	   try{
	      Scanner scan = new Scanner(new File("creatures.txt"));
	    while(scan.hasNext()){
	      MC.add(scan.next());
	    }
	   }catch (FileNotFoundException e) { //@throws FileNotFoundException if txt File isnt fount
	     System.out.println("Sorry no file found");
	   }
	   // Arrays to hold individual data
	   String [] name = new String[MC.size()];
	   String [] type = new String[MC.size()];
	   String [] color = new String[MC.size()];
	   int [] age = new int[MC.size()];
	   int index =0;
	    for(String i : MC){       // for each loop to separate the data
	      StringTokenizer st = new StringTokenizer(i, ","); // Creates tokens by separating every comma
	      name[index] = st.nextToken();
	      type[index] = st.nextToken();
	      color[index] = st.nextToken();
	      age[index] = Integer.valueOf(st.nextToken());
	      // Separates data for each dragon, creates an object for that creature, and adds it to the arraylist of creatures
	      if (type[index].contentEquals("Dragon")== true){
	        String nam = name[index];
	        String typ = type[index];
	        String colo = color[index];
	        int ag = age[index];
	        new Dragon(nam, typ,colo,ag);
	        list.add(new Dragon(nam, typ, colo, ag));
	        
	// Separates data for each elf, creates an object for that creature, and adds it to the arraylist of creatures
	      }else if (type[index].contentEquals("Elf")== true){
	        String nam = name[index];
	        String typ = type[index];
	        String colo = color[index];
	        int ag = age[index];
	        new Elf(nam, typ, colo, ag);
	        list.add(new Elf(nam, typ, colo, ag));
	        
	// Separates data for each genie, creates an object for that creature, and adds it to the arraylist of creatures
	      }else if (type[index].contentEquals("Genie")== true){
	        String nam = name[index];
	        String typ = type[index];
	        String colo = color[index];
	        int ag = age[index];
	        list.add(new Genie(nam, typ, colo, ag));
	        
	       
	// Separates data for each goblin, creates an object for that creature, and adds it to the arraylist of creatures
	      }else if (type[index].contentEquals("Goblin")== true){
	        String nam = name[index];
	        String typ = type[index];
	        String colo = color[index];
	        int ag = age[index];
	        list.add(new Goblin(nam, typ, colo, ag));
	      }
	     

	    } 
	    // creates a random number to select a creature
	    Random rand = new Random();
	    System.out.print("How many moves ? "); // Requests user input to find out how many times the game is played
	    Scanner scan = new Scanner(System.in);
	    int movesNum = scan.nextInt();

	    for(int i =0;i < movesNum;i++){
	      int kill = rand.nextInt(list.size());
	      int vic = rand.nextInt(list.size());
	      MagicalCreatures killer = list.get(kill);  // Takes random number and assigns it to a creature to make a killer and a victim
	      MagicalCreatures victim = list.get(vic);

	      System.out.println("Killer = "+ killer.getType()+" "+killer.getName());
	      System.out.println("Victim = "+ victim.getType()+" "+victim.getName());
	      war(killer, victim);
	      if(victim.getAlive()==false){ // Removes victim from the list if they are dead
	       list.remove(victim);
	        System.out.print(victim.getName() + " has died!");
	      }else {
	        System.out.println(victim.getName() +" is still alive!");
	      }    
	      System.out.println("\n--------------------------------------");
	      System.out.println("Creatures Still Alive after this round");
	      System.out.println("--------------------------------------");
	      for (int loop =0;loop<list.size();loop++){
	         System.out.println((loop)+" : "+list.get(loop));
	      }System.out.println("");
	    }
	  }
	 
	  public static void war(MagicalCreatures k, MagicalCreatures v){
	    // Method to make creatures fight, ensures that creatures cant kill themselves
	    // @param the two Magical creatures that will be battling
	    if (k.getName()==v.getName()){
	      System.out.println("I can't kill myself");
	      
	    }
	    k.kill(v);
	    
	  }
}

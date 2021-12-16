/**************************************************************
 * This class is used for creating cars to attach to the train
 */

package main;

public class Car {
	  public String factory;
	  public int stop;
	  public String material;
	  Car next;

	  public Car(){
	    //default constructor
	    this("",0,"");

	  }
	  public Car(String fact, int s, String m){
	    /*******************************************************
	     * regular constructor sets next to null
	     * @param fact
	     * @param s
	     * @param m
	     */
		  
	    this(fact,s,m,null);
	  }
	  public Car(String fact, int s, String m, Car next){
		  /*******************************************************
		     * regular constructor sets next to this.next
		     * @param fact
		     * @param s
		     * @param m
		     * @param next
		     */
	    this.next = next;
	    this.factory = fact;
	    this.stop = s;
	    this.material = m;

	  }

}

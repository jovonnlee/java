package main;

public class Contact extends Main{
	  private String firstName;
	  private String lastName;
	  private Long homeNumber;
	  private Long officeNumber;
	  private String emailAddress;
	  
	  /**
	   * Default onstructor for contacts
	   */
	  public Contact(){
	    this("","",0L,0L,"");
	  }
	  /**
	   * Constructor for contacts with inputs
	   * @param firstName
	   * @param lastName
	   * @param homeNumber
	   * @param officeNumber
	   * @param emailAddress
	   */
	  public Contact(String firstName, String lastName, Long homeNumber, Long officeNumber, String emailAddress){
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.homeNumber = homeNumber;
	    this.officeNumber = officeNumber;
	    this.emailAddress = emailAddress;
	  }
	  /**
	   * Method to get first name of contact
	   * @return firstName
	   */
	  public String getFirst(){
	    return firstName;
	  }
	  /**
	   * Method to get lasst name of contact
	   * @return lastName
	   */
	  public String getLast(){
	    return lastName;
	  }
	  /**
	   * Method to get home number of contact
	   * @return homeNumber
	   */
	  public long getHomeNum(){
	    return homeNumber;
	  }
	  /**
	   * Method to get office number of contact
	   * @return officeeNumber
	   */
	  public long getOfficeNum() {
	    return officeNumber;
	  }
	  /**
	   * Method to get email address of contact
	   * @return emailAddress
	   */
	  public String getEmail() {
	    return emailAddress;
	  }
	  /**
	   * Method to set first name of contact
	   * @param firstName
	   */
	  public void setFirst(String firstName) {
	    this.firstName = firstName;
	  }
	  /**
	   * Method to set last name of contact
	   * @param firstName
	   */
	  public void setLast(String lastName) {
	    this.lastName = lastName;
	  }
	  /**
	   * Method to set home phone of contact
	   * @param homeNumber
	   */
	  public void setHome(long homeNumber) {
	    this.homeNumber = homeNumber;
	  }
	  /**
	   * Method to set office phone of contact
	   * @param officeNumber
	   */
	  public void setOffice(long officeNumber) {
	    this.officeNumber = officeNumber;
	  }
	  /**
	   * Method to set emai address of contact
	   * @param emailAddress
	   */
	  public void setEmail(String emailAddress) {
	    this.emailAddress = emailAddress;
	  }

	  public String toString() {
	    return "First Name: "+firstName+"\nLast Name: "+lastName+"\nHome Number: "+homeNumber+"\nOffice Number: "+officeNumber+"\nEmail Address "+emailAddress;
	  }
	}

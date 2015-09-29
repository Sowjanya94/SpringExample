package test;

public class Person {
	  private int age = 0;
	  private String firstName = null;
	  private String lastName = null;
	  private Address address = null;

	  public Person(String fName, String lName){
	    firstName = fName;
	    lastName = lName;
	  }
	  public int getAge() {
	    return age;
	  }
	  
	  public void setAge(int age) {
	    this.age = age;
	  }
	  public Address getAddress() {
	    return address;
	  }
	  public void setAddress(Address address) {
	    this.address = address;
	  }
	  public void getDetails(){
	    System.out.println( firstName +" "+lastName 
	      +" is "+getAge()+" old and lives at "+address.getDoorNumber()+"  " +address.getFirstLine()+"  " +address.getSecondLine()+"  "  +address.getZipCode());
	  }
	}          
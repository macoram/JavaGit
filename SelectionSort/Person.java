//********************************************************
// Author: Melissa Coram
// Date: April 27, 2013
// Project 11
// Class to define the object 'Person'; includes set, get,
// constructor, toString, equals, and compareTo methods.
//********************************************************
public class Person implements Comparable<Object>{
	
	private String firstName;
	private String lastName;
	
	//default constructor
	public Person() {
		firstName = "";
		lastName = "";
	}
	
	//constructor with parameters
	public Person(String first, String last) {
		setName(first, last);
	}
	
	//method to set first name and last name
	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	//method to set first name
	public void setFirstName(String first) {
		firstName = first;
	}
	
	//method to set last name
	public void setLastName(String last) {
		lastName = last;
	}
	
	//method to return first name
	public String getFirstName() {
		return firstName;
	}
	
	//method to return last name
	public String getLastName() {
		return lastName;
	}
	
	//outputs variables into string
	public String toString() {
		return (firstName + " " + lastName);
	}
	
	//returns true if two objects are the same
	public boolean equals(Object otherPerson) {
		Person temp = (Person) otherPerson;
		
		return (firstName.equals(temp.firstName) &&
				lastName.equals(temp.lastName));
	}
	
	//
	public int compareTo(Object otherPerson) {
		Person temp = (Person) otherPerson;
		
		if (lastName.equals(temp.lastName))
			return (firstName.compareTo(temp.firstName));
		else 
			return (lastName.compareTo(temp.lastName));
	}
	
}

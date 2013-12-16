//*******************************************************
// Author: Melissa Coram
// Date: April 18, 2013
// Exercise 7, Chapter 11
// Prompts the user to enter a string and then outputs  
// the string and the string in reverse.
//*******************************************************
import java.util.*;

public class RecursionExample {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		String inputString;
		
		//Get string from the user
		System.out.print("Enter a string to be reversed: ");
		inputString = console.nextLine();
		//output normal string
		System.out.println("Your input string is:");
		System.out.println(inputString);
		//output reversed string
		System.out.println("Your input string reversed is:");
		System.out.println(UserString.reverseString(inputString));
	}

}

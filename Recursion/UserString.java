//*******************************************************
// Author: Melissa Coram
// Date: April 18, 2013
// Exercise 7, Chapter 11
// Method to reverse a string input by the user. 
//*******************************************************
public class UserString {
	private static String newString = "";
	
	public static String reverseString(String userString) {

		if (userString.length() <= 1) {
			newString = userString + newString;
		}
		else {
			newString = userString.charAt(0) + newString;
			userString = reverseString(userString.substring(1));
			
		}
		
		return newString;
	}
	
	
}

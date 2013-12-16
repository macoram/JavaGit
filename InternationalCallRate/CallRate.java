//*****************************************************
// Author: Melissa Coram
// Date: February 9, 2013
// Exercise 4, Chapter 4
// Prompts the user to enter the number of minutes a 
// call lasted and outputs the amount due.
//*****************************************************

import java.util.*;

public class CallRate {
	
	static Scanner console = new Scanner(System.in);
	
	static final double CONNECTION_FEE=1.99;
	static final double FIRST_THREE_MIN=2.00;
	static final double ADD_MIN_FEE=.45;
	
	public static void main(String[] args) {
		int numMinutes;
		double amtDue;
		
		String strAmtDue;
		String outputString;
		
		
		//get input from user
		System.out.print("Enter the length of the call in minutes: ");
		
		numMinutes = console.nextInt();
		System.out.println();
		
		//calculate the amount due
		if (numMinutes <= 3)
			amtDue = CONNECTION_FEE + FIRST_THREE_MIN;
		else
			amtDue = CONNECTION_FEE + FIRST_THREE_MIN + ((numMinutes - 3) * ADD_MIN_FEE);
		
		//output the amount due
		outputString = String.format("The total amount due for this call is " +
				"$%.2f.", amtDue);

		System.out.println(outputString);
	}
}

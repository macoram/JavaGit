//*******************************************************
// Author: Melissa Coram
// Date: April 12, 2013
// Exercise 1, Chapter 10
// Prompts the user to enter a length in feet and inches 
// and calculates and displays the length in centimeters.
//*******************************************************
import java.util.*;
public class Inches2Centimeters {
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		double feet;
		double inches;
		boolean done = false;
		String str;
		
		System.out.println("Input the length in feet and inches.");
		
		//get the length - throw/catch exception for invalid input
		//display length in centimeters
		do {
			try {
				System.out.print("Enter the number of feet: ");
				feet = console.nextDouble();
				if (feet < 0) 
					throw new Exception();
				System.out.print("Enter the number of inches: ");
				inches = console.nextDouble();
				if (inches < 0)
					throw new Exception();
				System.out.println();
				done = true;
				System.out.println("The length is equal to " + ConvertLength.Convert(feet, inches) + 
						" centimeters.");	
			}
			catch (Exception eRef) {
				str = console.nextLine();
				System.out.println("Invalid input.  Please only enter positive numbers.");
				System.out.println();
			}

		}
	while (!done);
		
	}
}

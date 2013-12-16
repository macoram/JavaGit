
//*****************************************************
// Author: Melissa Coram
// Date: February 21, 2013
// Test 1, Program 1
// Prompts the user to enter the distance in miles and
// outputs the distance in kilometers.
//*****************************************************

import java.util.*;

public class MilesToKm {
	static Scanner console = new Scanner(System.in);
	
	static final double MILES_IN_KM = 1.609;

	public static void main(String[] args) {
		double distanceMiles = 0;
		double distanceKms = 0;
		
		String inputOK = "N"; //determines valid input
		String outputString; 
		
		// Get the distance in kilometers from the user
		while (inputOK == "N") {
		
			System.out.print("Please enter the distance in miles: ");
			distanceMiles = console.nextDouble();
			System.out.println();
		
			// Determine if the input is >= 0
			if (distanceMiles >= 0) {
				inputOK = "Y";
			}
			else {
				System.out.println("The distance must be greater than" +
				"or equal to zero.");
			};
		}
		
		// calculate and output the distance in kilometers	
		distanceKms = distanceMiles * MILES_IN_KM;
		
		outputString = String.format("The distance in kilometers is %.3f",
				distanceKms);

		System.out.println(outputString);
	}
}

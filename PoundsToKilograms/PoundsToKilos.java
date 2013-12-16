
//*****************************************************
// Author: Melissa Coram
// Date: January 24, 2013
// Exercise 4, Chapter 2
// Prompts the user to enter the weight of a package in 
// pounds and outputs the weight in kilograms.
//*****************************************************

import java.util.*;

public class PoundsToKilos {

	static Scanner console = new Scanner(System.in);
	
	static final double LBS_IN_KILOS = 2.2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weightPounds;
		double weightKilos;
		
		String strPounds;
		String outputString;
		
		// Get the weight in pounds from the user
		System.out.print("Enter weight in pounds: ");
		
		weightPounds = console.nextDouble();
		System.out.println();
		
		// Calculate the weight in kilograms
		weightKilos = weightPounds / LBS_IN_KILOS;
		
		// Output the weight in kilograms
		outputString = String.format("The weight of the package "
				+ "in kilograms is %.2f", weightKilos);

		System.out.println(outputString);		
	
	}

}

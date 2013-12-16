//*******************************************************
// Author: Melissa Coram
// Date: April 12, 2013
// Exercise 1, Chapter 10
// Prompts the user to enter a length in feet and inches 
// and calculates and displays the length in centimeters.
//*******************************************************
public class ConvertLength {
	final static double IN_TO_CM = 2.54;
	
	public static double Convert(double ft,double in) {
		double lengthInCM;
		lengthInCM = ((ft * 12) + in) * IN_TO_CM;
		return lengthInCM;	
	}

}

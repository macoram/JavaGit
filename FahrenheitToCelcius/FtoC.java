//*******************************************************
// Author: Melissa Coram
// Date: January 24, 2013
// Exercise 21, Chapter 2
// Prompts the user to enter a temperature in Fahrenheit 
// and calculates and displays the temperature in Celcius
//*******************************************************

import java.util.*;
import javax.swing.*;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double fahrenheit;
		Double celcius;
		
		String strFahrenheit;
		String strOutput;
		
		// get temperature in fahrenheit from the user
		strFahrenheit = JOptionPane.showInputDialog("Enter the temperature in Fahrenheit"
				+ " and press OK.");
		
		// convert input string to double
		fahrenheit = Double.parseDouble(strFahrenheit);
		
		// calculate fahrenheit to celcius
		celcius = (fahrenheit - 32) * 5 / 9;
		
		// display temperature in fahrenheit and celcius
		strOutput = String.format("The temperature is %.2f degrees Fahrenheit.%n" 
				+ "The temperature is %.2f degrees Celcius.", fahrenheit, celcius);
		
		JOptionPane.showMessageDialog(null, strOutput, "Temperature Conversion",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}

}

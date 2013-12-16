//*****************************************************
// Author: Melissa Coram
// Date: February 21, 2013
// Test 1, Program 2
// Prompts the user for two numbers and outputs the sum
// of all numbers between (and including) the given 
// numbers. 
//*****************************************************

import java.util.*;

public class SumValues {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		int numSums;
		
		//get input from user
		System.out.print("Please enter your starting value: ");
		firstNum = console.nextInt();
		System.out.print("Please enter your ending value: ");
		secondNum = console.nextInt();
		
		//calculate the sum of the numbers between 1st and 2nd number
		numSums = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			numSums = numSums + i;
		};
		
		//output the sum
		System.out.println("The sum of your numbers is " + numSums + ".");
	}

}

//*****************************************************
// Author: Melissa Coram
// Date: February 14, 2013
// Exercise 10, Chapter 5
// Prompts the user for two numbers and outputs all odd
// numbers, the sum of all even numbers, and the sum of 
// the squares of all odd numbers between.  Outputs all 
// numbers between 1 and 10 and their squares.  Outputs 
// all uppercase letters.
//*****************************************************

import java.util.*;

public class NumbersAndLetters {

	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		int evenSum; //holds the sum of the even numbers
		int oddSquareSum; //holds the sum of the squares of the
		                  //odd numbers

		
		//get input from user
		System.out.print("Please enter your first integer: ");
		firstNum = console.nextInt();
		System.out.print("Please enter your second integer: ");
		secondNum = console.nextInt();

		
		//swaps first and second number values if the second number
		//is less than the first number
		if (secondNum < firstNum) {
			int tempNum; //holding variable to swap numbers
			tempNum = secondNum;
			secondNum = firstNum;
			firstNum = tempNum;
		};
		
		
		//prints a list of the odd numbers between the first
		//number and the second number
		System.out.print("Odds:");
		
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			};
		}
		
		System.out.println();
		
		
		//prints the sum of all the even numbers between the 
		//first number and second number
		int evenCounter = firstNum;
		evenSum = 0;
		
		while (evenCounter <= secondNum) {
			if (evenCounter % 2 == 0) {
				evenSum = evenSum + evenCounter;				
			}
			evenCounter++;
		}
		
		System.out.println("Sum of evens: " + evenSum);
		
		
		//prints the numbers between 1 and 10 and their squares
		System.out.println("Squares of numbers from 1 to 10:");
		int squareCounter = 1;
		
		do {
			int squareNum; //holds the square of the current number
			squareNum = (int) Math.pow(squareCounter, 2);
			System.out.println(squareCounter + " " + squareNum);
			squareCounter++;
		}
		while (squareCounter <= 10);
		
		
		//prints the sum of the squares of the odd numbers
		//between first number and second number
		oddSquareSum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				int squareNum; //holds the square of the current number
				squareNum = (int) Math.pow(i, 2);
				oddSquareSum = oddSquareSum + squareNum;
			}
		}
		System.out.println("Sum of the squares of the odds: " 
		+ oddSquareSum);
		
		
		//prints all of the uppercase letter from A to Z
		System.out.print("Uppercase letters: ");
		int letterCounter = (int) ('A');
		int endLetterCounter = (int) ('Z');
		
		while (letterCounter <= endLetterCounter) {
			System.out.print((char) (letterCounter));
			letterCounter++;
		}
	}	
}

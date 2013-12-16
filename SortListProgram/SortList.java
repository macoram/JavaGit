//******************************************************
// Author: Melissa Coram
// Date: March 22, 2013
// Project 7
// Accepts 10 integer input values from the user and 
// stores the values in an array.  Displays the values
// of the unsorted array to the user, then sorts the 
// array in ascending order and displays the values of
// the sorted array.
//******************************************************

import java.util.*;

public class SortList {

	static Scanner console = new Scanner(System.in);
	//defines the maximum number of input values accepted from
	//the user
	static final int NO_OF_VALUES = 10; 
	
	public static void main(String[] args) {
		
		int[] valueList = new int[NO_OF_VALUES];
		int temp;
		
		//get input from the user
		System.out.println("Enter the 10 values to sort...");
		for (int i = 1; i <= NO_OF_VALUES; i++) {
			System.out.print("Enter value #" + i + ": ");
			temp = console.nextInt();
			valueList[i - 1] = temp;
		}
		System.out.println();
		
		//print unsorted array values
		System.out.println("Here are your numbers (unsorted):");
		System.out.println(Values.toString(valueList, NO_OF_VALUES));
		System.out.println();
		
		//sort values and print to screen
		System.out.println("Here are your numbers (sorted):");
		Values.SortList(valueList, NO_OF_VALUES);
		System.out.println(Values.toString(valueList, NO_OF_VALUES));
	}

}

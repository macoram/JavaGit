//******************************************************
// Author: Melissa Coram
// Date: March 28, 2013
// Test #2
// Accepts 10 integer values from the user and displays 
// the sorted list of input values after each new input.
//******************************************************

import java.util.*;

public class ListSorter {

	static Scanner console = new Scanner(System.in);
	//defines the maximum number of input values accepted from
	//the user
	static final int NO_OF_VALUES = 10; 

	public static void main(String[] args) {

		int[] valueList = new int[NO_OF_VALUES];
		int temp;
		
		//get input from the user and displays the sorted list
		System.out.println("Enter 10 integers - one at a time...");
		for (int i = 1; i <= NO_OF_VALUES; i++) {
			System.out.print("Enter integer #" + i + ": ");
			temp = console.nextInt();
			valueList[i - 1] = temp;
			ListMethods.SortList(valueList, i);
			System.out.println("Sorted numbers: " + ListMethods.toString(valueList, i));			
		}

		System.out.println("Done!");
	}

}

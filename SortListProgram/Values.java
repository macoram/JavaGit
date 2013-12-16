//******************************************************
// Author: Melissa Coram
// Date: March 22, 2013
// Project 7
// Class to define methods for processing an array of 
// values accepted from the user.
//******************************************************

import java.util.*;

public class Values {

	public static String toString(int[] inputList, int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str = String.format(str + inputList[i] + " ");
					}
		return str;
	}
	
	public static void SortList(int[] inputList, int length) {
		for (int firstOutOfOrder = 1; firstOutOfOrder < length;
				firstOutOfOrder++) {
			
			int compValue = inputList[firstOutOfOrder];
			
			if (compValue < inputList[firstOutOfOrder -1]) {
				
				int temp = inputList[firstOutOfOrder];
				int location = firstOutOfOrder;
			
				do {
					inputList[location] = inputList[location - 1];
					location--;
				}
				while (location > 0 && temp < inputList[location - 1]);
		
				inputList[location] = temp;
			}
		}
	}

}

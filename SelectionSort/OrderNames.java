//*******************************************************
// Author: Melissa Coram
// Date: April 27, 2013
// Project 11
// Prints and sorts an array of objects.  
//*******************************************************
import java.util.*;

public class OrderNames {

	public static void main(String[] args) {
		
		//instantiate and fill array
		Person[] presArray = new Person[5];
		presArray[0] = new Person("George", "Washington");
		presArray[1] = new Person("Theodore", "Roosevelt");
		presArray[2] = new Person("Woodrow", "Wilson");
		presArray[3] = new Person("Franklin", "Roosevelt");
		presArray[4] = new Person("Barack", "Obama");
		
		SearchSortAlgorithms<Person> sortObject = 
				new SearchSortAlgorithms<Person>();
		
		//print the names in the array in the order they are stored
		System.out.println("Here are the presidents in the order " +
				"they served the US:");
		print(presArray, presArray.length);
		System.out.println();
		//for (int index = 0; index < presArray.length; index++) {
		//	System.out.println(presArray[index].toString());
		//}

		//sort the names by last name
		sortObject.selectionSort(presArray, presArray.length);
		
		//print the sorted list	
		System.out.println("Here are the presidents in alphabetical" +
				" order by last name:");
		print(presArray, presArray.length);
		
	}
	public static <T> void print(T[] list, int length){
		for (T elem : list)
			System.out.println(elem);
	}

}

//*******************************************************
// Author: Melissa Coram
// Date: April 27, 2013
// Project 11
// Defines an object to manipulate collection objects  
// for selection sort method.
//*******************************************************
public class SearchSortAlgorithms<T> {


	public void selectionSort(T[] list, int listLength) {
		int smallestIndex;
		T temp;
		
		for (int index = 0; index < listLength -1; index++) {
			smallestIndex = index;
			
			for (int minIndex = index + 1; minIndex < listLength; minIndex++) {
				Comparable<T> compElem = (Comparable<T>) list[minIndex];
				
				if (compElem.compareTo(list[smallestIndex]) < 0)
					smallestIndex = minIndex;
			}
			
			temp = list[smallestIndex];
			list[smallestIndex] = list[index];
			list[index] = temp;
		}
	}
}

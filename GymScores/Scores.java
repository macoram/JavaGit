//******************************************************
// Author: Melissa Coram
// Date: March 7, 2013
// Chapter 7, Exercise 5
// Accepts 8 scores from the user and displays the total 
// score, minus the highest and lowest score.
//******************************************************

import java.util.*;

public class Scores {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {

		double[] arrayScores = new double[8];
		double totalScore = 0;
		double minScore;
		double maxScore;
		int maxIndex = 0;
		int minIndex = 0;
		String outputString;
		
		//get 8 scores from the user and total the scores
		System.out.println("Please enter the scores (1-10) from the eight judges: ");
		
		for (int counter = 0; counter < arrayScores.length; counter++) {
			arrayScores[counter] = console.nextDouble();
			totalScore = totalScore + arrayScores[counter];
		}
		
		//find the highest score
		for (int index = 1; index < arrayScores.length; index++) {
			if (arrayScores[maxIndex] < arrayScores[index])
				maxIndex = index;
		}
		maxScore = arrayScores[maxIndex];
		
		//find the lowest score
		for (int index = 1; index < arrayScores.length; index++) {
			if (arrayScores[minIndex] > arrayScores[index])
				minIndex = index;
		}
		minScore = arrayScores[minIndex];
		
		//highest and lowest scores are removed from the total scores
		totalScore = totalScore  - minScore - maxScore;
		
		//output the total score
		outputString = String.format("The total score is: %.2f", totalScore);
		System.out.println(outputString);
	}

}

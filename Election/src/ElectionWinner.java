//******************************************************
// Author: Melissa Coram
// Date: March 7, 2013
// Chapter 7, Exercise 8
// Accepts 5 election candidates and number of votes  
// from the user and displays a list of the candidates,
// the number of votes for each candidate and the
// percentage of the total vote for each candidate. Also
// displays the total number of votes and the winner.
//******************************************************

import java.util.*;

public class ElectionWinner {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		Candidate[] candidates = new Candidate[5];
		int totalVotes = 0;
		double votePercent;
		int counter = 0;
		String cName;
		int votes;
		double maxVotePercentage = 0;
		int winnerIndex = 0;
		
		//get candidates and number of votes
		while (counter < candidates.length) {
			String str;
			str = String.format("Please enter candidate #" + (counter+1) + 
					"'s name and number of votes: ");
			System.out.print(str);
			cName = console.next();
			votes = console.nextInt();
			candidates[counter] = new Candidate(cName, votes);
			totalVotes = votes + totalVotes;
			counter++;
		}
		
		//print the candidates names, votes received, and percentage of votes
		System.out.println();
		System.out.println("Candidate    Votes Received    % of Total Votes");
		
		for (int i = 0; i < candidates.length; i++) {
			double percentVotes;
			String str;
			
			percentVotes = candidates[i].VotePercentage(totalVotes);
			str = candidates[i].toString();
						
			System.out.println(str);
			
			//determines which candidate has the maximum percentage of votes
			if (percentVotes > maxVotePercentage) {
				maxVotePercentage = percentVotes;
				winnerIndex = i;
			}
		}
		System.out.println("Total             " + totalVotes);
		System.out.println("The Winner of the Election is " + 
				candidates[winnerIndex].getName() + ".");
	}

}

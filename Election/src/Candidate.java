//******************************************************
// Author: Melissa Coram
// Date: March 2, 2013
// Project 5
// Class definition for Candidate--includes constructor 
// and accessor methods, as well as a method to find the
// candidates percentage of the total vote.
//******************************************************

public class Candidate {

	private String candidateName;
	private int numVotes;
	private double percentVote;
	
	//constructor method - requires name and number of votes
	public Candidate(String cName, int votes) {
		candidateName = cName;
		numVotes = votes;
		}
	
	//method to calculate and return the candidate's percentage of 
	//total votes
	public double VotePercentage(int totalVotes) {
		percentVote = ((double) (numVotes) / totalVotes) * 100;
		return percentVote;				
	}
	
	//method to return the name of the candidate
	public String getName() {
		return candidateName;
	}
	
	//method to return name, number of votes, and percentage of votes
	//as a string
	public String toString() {
		String str;
		str = String.format("%-17s %-15s %.2f%%", candidateName,
							numVotes, percentVote);
		return str;
	}

}

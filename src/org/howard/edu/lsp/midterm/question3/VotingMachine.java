package org.howard.edu.lsp.midterm.question3;

public class VotingMachine {
    private String[] candidates;
    private int[] votes;

    // Constructor
    public VotingMachine() {
        candidates = new String[10]; // Array to store candidate names
        votes = new int[10]; // Array to store candidate votes
    }

    // Add a candidate to the election
    public void addCandidate(String name) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] == null) {
                candidates[i] = name;  // Add the candidate
                votes[i] = 0;  // Initialize votes to 0
                return;
            }
        }
    }

    // Cast a vote for a candidate
    public boolean castVote(String candidateName) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] != null && candidates[i].equals(candidateName)) {
                votes[i]++;
                return true;
            }
        }
        return false;  // Candidate not found
    }

    // Get the total number of votes for a candidate
    public String getWinner() {
        int maxVotes = 0;
        String winner = "";
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] != null && votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
            }
        }
        return winner + " WINS with " + maxVotes + " votes!!";
    }
}

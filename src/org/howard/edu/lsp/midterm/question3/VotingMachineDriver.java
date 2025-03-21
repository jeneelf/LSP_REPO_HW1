package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();
        votingMachine.addCandidate("Alice");
        votingMachine.addCandidate("Bob");
        votingMachine.addCandidate("Charlie");

        votingMachine.castVote("Alice");
        votingMachine.castVote("Bob");  
        votingMachine.castVote("Alice");
        votingMachine.castVote("Charlie");
        votingMachine.castVote("Alice");
        votingMachine.castVote("Bob");
        votingMachine.castVote("Alice");
        votingMachine.castVote("Alice");
        votingMachine.castVote("Charlie");
        votingMachine.castVote("Charlie");
        votingMachine.castVote("Charlie");

        System.out.println(votingMachine.getWinner());
    }
}

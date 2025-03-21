package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    private String sentence;

    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    // Method to find the longest words
    
    public List<String> findLongestWords() {
        String[] words = sentence.split("\\s+");
        int maxLength = 0;

        
        List<String> longestWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
                longestWords.add(word);
                // If the word is longer than the current max length, clear the list and add the word
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }
        return longestWords;
        
    }
}

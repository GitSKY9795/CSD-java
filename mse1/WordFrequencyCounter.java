package mse1;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog. The dog sleeps.";
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("Input sentence is empty or null.");
            return;
        }
        String cleanedSentence = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words = cleanedSentence.split("\\s+");

       
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        
       
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        
        TreeMap<String, Integer> sortedWordFrequency = new TreeMap<>(wordFrequency);
        
       
        if (sortedWordFrequency.isEmpty()) {
            System.out.println("No valid words found in the sentence.");
        } else {
            for (Map.Entry<String, Integer> entry : sortedWordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
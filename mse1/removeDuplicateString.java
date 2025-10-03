package mse1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a string");
        String b = sc.nextLine();
        String cleanSentence = b.toLowerCase().replace("[^a-zA-Z\\s]", "");
        String [] arr = cleanSentence.split("\\s+");
      ArrayList<String> wordList = new ArrayList<>();
        for (String word : arr) {
            if (!word.isEmpty()) {
                wordList.add(word);
            }
        }
        Set<String>str = new TreeSet<>(wordList);
        System.out.println(str);
    }
    
}

package mse1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class stringwordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter a string");
    String str = sc.nextLine();
    String cleanSentence = str.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
    String[] word = cleanSentence.split("\\s+");
    HashMap<String, Integer> wordFrequency = new HashMap<>();
   
        for (String words : word) {
            if (!words.isEmpty()) {
                wordFrequency.put(words, wordFrequency.getOrDefault(words, 0) + 1);
            }
        }
         TreeMap<String,Integer>ump =new TreeMap<>(wordFrequency);

    for(Map.Entry<String,Integer> e : ump.entrySet()){
        System.out.println(e.getKey()+":->"+e.getValue());
    }
  
      
    }
  
}

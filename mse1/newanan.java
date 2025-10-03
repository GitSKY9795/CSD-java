package mse1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class newanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<String>words = new ArrayList<>();
        System.out.println("Enter total number of words: ");
        int n =sc.nextInt();
        System.out.println("Enter  words: ");
        for(int i=0;i<n;i++){
            words.add(sc.next());
        }
        List<List<String>>result= new ArrayList<>();
        Map<String,List<String>>umap = new HashMap<>();
        for(String word : words){
            if(word.isEmpty()){
                System.out.println("Details to dal sale :");
            }
            char chara[]= word.toLowerCase().toCharArray();
            Arrays.sort(chara);
            String sortedKey = new String(chara);
            if(!umap.containsKey(sortedKey)){
                umap.put(sortedKey,new ArrayList<>());
            }
            umap.get(sortedKey).add(word);
        }
        result.addAll(umap.values());
        System.out.println(result);

    }
    
}

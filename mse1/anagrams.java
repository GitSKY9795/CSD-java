package mse1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagrams {
    public static void main(String[] args) {
        String [] words ={"cat","tat","eat","tea","dog","cat"};
        List<List<String>> result = new ArrayList<>();
        if(words ==null||words.length==0){
            System.out.println(result);
        return;
        }
        Map<String,List<String>>anagrams =new HashMap<>();
        for(String word: words){
            if(word==null||word.isEmpty()){
                continue;
            }
            char [] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sortedKeys= new String(chars);
            if(!anagrams.containsKey(sortedKeys)){
                anagrams.put(sortedKeys, new ArrayList<>());
            }
            anagrams.get(sortedKeys).add(word)
;        }
result.addAll(anagrams.values());
System.out.println(result);
    }
    
}

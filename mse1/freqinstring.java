package mse1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class freqinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        Map<Character , Integer> charFreq = new HashMap<>();
        for(char c: st.toCharArray()){
            if(c!=' '){
                charFreq.put(c,charFreq.getOrDefault(c,0)+1);
            }
        }
        Map<Character,Integer> uio = new TreeMap<>(charFreq);
        for(Map.Entry<Character,Integer> e :uio.entrySet()){
            System.out.println(e.getKey()+":-> "+e.getValue());
        }
    }
    
}

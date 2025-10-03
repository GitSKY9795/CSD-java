package mse1;

import java.util.HashMap;
import java.util.Map;

public class removeduplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,5,5,8,9};
        Map<Integer,Integer>ma = new HashMap<>();
        for(int num : arr){
            if(!ma.containsKey(num)){
                ma.put(num , ma.getOrDefault(num,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer>e:ma.entrySet()){
            System.out.println(e.getKey());
        }
    }
    
}

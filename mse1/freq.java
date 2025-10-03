package mse1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n;
         n=sc.nextInt();
        Map<Integer,Integer> umap = new HashMap<>();
        for(int i =0;i<n;i++){
            int a = sc.nextInt();
            umap.put(a,umap.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e : umap.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
    }
}

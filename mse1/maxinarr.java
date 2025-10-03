package mse1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class maxinarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>list= new ArrayList<>();
        System.out.println("Enter how may elements in an array");
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.getLast());
        
    }
    
}

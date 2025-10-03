package mse1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the list ");
       int n = sc.nextInt();
       for(int i = 0; i < n; i++){
           list.add(sc.next());
       }
       
       String shortest = list.get(0); 
       for(int i = 1; i < n; i++){
           if(list.get(i).length() < shortest.length()){
               shortest = list.get(i);
           }
       }
       
       System.out.println("The shortest string is: " + shortest);
    }
}

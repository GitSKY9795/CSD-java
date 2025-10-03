package mse1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class appendHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer>ump = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
           ump.add(sc.nextInt());
        }
        System.out.println("Enter the element you want to append at last ");
        int c = sc.nextInt();
        ump.add(c);
        
    }
    
}

package mse1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class iterateLinked {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.println("Enter the total number of the elements :");
        n = sc.nextInt();
        for(int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
           
    }
    
}

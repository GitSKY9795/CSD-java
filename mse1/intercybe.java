package mse1;

import java.util.Scanner;

interface cube{
   int ans(int x);
   
}
class cubeOps implements cube{
    @Override
    public int ans(int x) {
       return (x*x*x);
    }
    
    
    
}
public class intercybe {
    public static void main(String[] args) {
        cubeOps obj = new cubeOps();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the cube of the number");
    int n = sc.nextInt();
  
    System.out.println(  obj.ans(n));
        
    }
    
}

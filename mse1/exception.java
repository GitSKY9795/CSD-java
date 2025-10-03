package mse1;

import java.util.Scanner;

public class exception {
	public static int divideNumbers(int a , int b) throws Exception{
		if(b==0)
			throw new ArithmeticException("Cannot divide by zero");
		return a/b;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
          int c=divideNumbers(a,b);
          System.out.println("Result: " + c);
        } catch (Exception e) {
          System.out.println("Error: ");
        }
        finally{
            System.out.println("The code has runned successfully");
        }
    }
}

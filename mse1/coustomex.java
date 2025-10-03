package mse1;

import java.util.Scanner;

class InvalidAgeException extends Exception{
public InvalidAgeException(String message){
    super(message);
}
 }
public class coustomex {
    public static void checkeligibility(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Harami sale jake pdhle");
        }
        else{
            System.out.println("Abki baar modi sarka , jao modi ko vote do");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int age;
            System.out.println("Enter age");
            age= sc.nextInt();
            checkeligibility(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Bhari mistake hogya sirrrr...");

        }
    }

    
}
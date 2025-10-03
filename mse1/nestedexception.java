package mse1;

import java.util.Scanner;

class InvalidException extends Exception{
    public InvalidException(String message) {
        super(message);
    }

}
public class nestedexception {
    public static  void  validateRegisteration(int age,String name) throws InvalidException{
if(age<=18){
    throw new InvalidException("jao pdho munna");
}
if(name.length()==0){
    throw new IllegalArgumentException("Bhootni ke nam to dal lo");
}
System.out.println("Refgisteration successfull");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        String name= sc.next();
        try{
            validateRegisteration(age, name);
        }
        catch (InvalidException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
}

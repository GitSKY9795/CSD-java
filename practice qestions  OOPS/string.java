import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String s;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a string to check wether a string is palindrome or not.");
        s=sc.nextLine();
        String rev="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }

    }
    
}

import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner (System.in);
        a=sc.nextInt();
        int rev=0;
        int n=a;    
        while(a!=0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        if(n==rev){
            System.out.println("The number is a palindrome.");
        }else{
            System.out.println("The number is not a palindrome.");
        }

    }
}

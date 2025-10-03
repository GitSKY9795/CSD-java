import java.util.Scanner;

public class fibonaaci {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n;
    System.out.println("Enter the rangeo  of the fibonacci series.");
    n= sc.nextInt();
    int a=0;
    int b=1;
    int sum=0;
    if(n>=1){
        System.out.print(a+" ");
    }
    if(n>=2){
        System.out.print(b+" ");
    }
    for(int i=2;i<n;i++){
        sum =a+b;
        System.out.print(sum+" ");
        a=b;
        b=sum;
    }
    
    }
}    


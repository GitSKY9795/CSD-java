import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int []arr;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array.");
         int n;
         n= sc.nextInt();
       arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
         }
         System.out.println(Arrays.toString(arr));


    }
    
}

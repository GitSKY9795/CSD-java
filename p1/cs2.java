package p1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cs2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("New main");
        Scanner sc =new Scanner(new File("src/p1/aa.txt"));
        System.out.println("enter  stirng");
        String data=sc.next();
        System.out.println(data);
    }
}

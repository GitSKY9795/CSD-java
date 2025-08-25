import java.util.Scanner;

public class bot {
    int empid=101;
    String add;
    String sname;
    long nsal;
    void calculate(long salary){
        System.out.println("return adress");

    }
   
    public static void main(String[] args) {
       bot e1[]=new bot[10];
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<e1.length;i++){
           e1[i]=new bot();
           e1[i].empid=101+i;
           System.out.println("Enter name:");
           e1[i].sname=sc.nextLine();
           System.out.println("Enter address:");
           e1[i].add=sc.nextLine();
           System.out.println("Enter salary:");
           e1[i].nsal=sc.nextLong();
           sc.nextLine();
       }
       System.out.println("Enter address to search:");
       String addr = sc.nextLine();
       for(int i=0;i<e1.length;i++){
           if(e1[i].add.equals(addr)) {
               System.out.println("Address is of " + e1[i].sname);
           } else {
               System.out.println("Address is of " + e1[i].sname);
           }
       }
   }
}
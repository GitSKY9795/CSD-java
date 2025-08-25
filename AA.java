import java.util.Scanner;
public class AA{
    String name;
    long id;
    String branch="CS";
    char section ='D';
    int Marks[]=new int[5];
    
  

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        AA[] students = new AA[n];

        for(int j=0;j<n;j++){
            students[j] = new AA();
            System.out.println("Enter details for student " + (j+1));
            System.out.println("Enter Name");
            students[j].name= sc.nextLine();
            System.out.println("Enter ID");
            students[j].id= sc.nextLong();
            sc.nextLine(); // consume newline
            System.out.println("Enter Branch");
            students[j].branch= sc.nextLine();
            System.out.println("Enter Section");
            students[j].section= sc.next().charAt(0);
            sc.nextLine(); // consume newline
            System.out.println("Enter 5 marks:");
            for(int i=0;i<5;i++){
                students[j].Marks[i]= sc.nextInt();
            }
            sc.nextLine(); // consume newline
        }

        for(int j=0;j<n;j++){
            System.out.println("Details of student " + (j+1) + ":");
            System.out.println("NAME: " + students[j].name);
            System.out.println("ID: " + students[j].id);
            System.out.println("BRANCH: " + students[j].branch);
            System.out.println("SECTION: " + students[j].section);
            System.out.print("MARKS: ");
            for(int i=0;i<5;i++){
                System.out.print( students[j].Marks[i] + " ");
            }
            System.out.println();
        }
    }
}

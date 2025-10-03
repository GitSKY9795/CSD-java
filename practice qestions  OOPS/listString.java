import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listString {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the names");
        for(int i=0;i<n;i++){
            names.add(sc.next());
        }
        for(int i=0;i<names.size();i++){
            if(names.get(i).charAt(0)=='A'){
                names.remove(i);
            }
            
        }
        System.out.println("Names without A at starting are: ");
  
      System.out.println(names);
            
        }
    }


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class listodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      List<Integer>list= new ArrayList<>();
    int n;
    System.out.println("Enter the size of the array:");
    n= sc.nextInt();
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<n;i++){
        list.add(sc.nextInt());
    }
    for(int i=0;i<list.size();i++){
      if(list.get(i)%2==0){
        list.remove(i);

      }

    }


    System.out.println("The odd elements in the array are:");
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }}}

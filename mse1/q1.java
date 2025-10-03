//you are given two java list objects list1 nd list2 write a java program that uses linked hashset to perform the following operation 
//while reserving insertion order 1> union of all the unique elements of both the list . 2> intersection of both the list 3> the difference, elements in list 1 that are not in list2
package mse1;
import java.util.LinkedHashSet;
import java.util.Set;
public class q1 {
    public static void main(String[] args) {
         Set<Integer> list1 = new LinkedHashSet<>();
    Set<Integer> list2 = new LinkedHashSet<>();
    list1.add(20);
    list1.add(50);
    list1.add(40);
    list1.add(30);

    list2.add(100);
    list2.add(110);
    list2.add(120);
    list2.add(130);
    list2.add(40);
    list2.add(30);
    Set<Integer> union = new LinkedHashSet<>(list1);
    union.addAll(list2);
    System.out.println("The union of the sets is: " + union);
    Set<Integer> intersection = new LinkedHashSet<>(list1);
    intersection.retainAll(list2);
    System.out.println("The intersection of the set is : "+intersection);
    Set<Integer> difference = new LinkedHashSet<>(list1);
    difference.removeAll(list2);
    System.out.println("The difference of the set is : "+difference);

    }
   
       
}

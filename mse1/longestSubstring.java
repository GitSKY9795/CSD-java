package mse1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Student implements Comparable<Student>{
int id;
String name;
int marks;
Student(int id, String name, int marks){
    this.name =name;
    this.id=id;
    this.marks=marks;
}
    @Override
    public int compareTo(Student that) {
        return  this.marks-that.marks;
       
    }
    @Override
    public String toString(){
        return  name+"(ID: "+id+", Marks:"+marks+")";
    }

}

public class longestSubstring {
    public static void main(String[] args) {
        Map<Integer,Student> stdMap = new HashMap<>();
        stdMap.put(101, new Student(101, "Alice", 85));
        stdMap.put(102, new Student(102, "Bob", 90));
        stdMap.put(103, new Student(103, "Charlie", 80));
        ArrayList<Student> students = new ArrayList<>(stdMap.values());
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);

    }
}
}

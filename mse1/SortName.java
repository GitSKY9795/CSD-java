package mse1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Student  {
    int id;
    int marks;
    String name;
    Student(int id, int marks, String name){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }
    @Override
    public String toString(){
      return name + " (ID: " + id + ", Marks: " + marks + ")";
    }

    }


public class SortName {
    public static void main(String[] args) {
        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(101, new Student(101, 85, "Alice"));
        studentMap.put(102, new Student(102, 90, "Bob"));
        studentMap.put(103, new Student(103, 80, "Charlie"));
        List<Student> students= new ArrayList<>(studentMap.values());
      Collections.sort(students, (o1, o2) -> {
        return o1.name .compareTo(o2.name);
      });
        for (Student student : students) {
            System.out.println(student);
        }
    
}
}
import java.util.Objects;

public class student implements Comparable<student>{
    String name;
    int rollno;
    public student(String name, int rollno){

        this.name=name;
        this.rollno=rollno;
    }
    @Override
    public String toString(){
        return "Student{"+"name='"+name+'\''+",rollNo="+rollno+'}';
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof student)) return false;
        student other=(student) obj;
        return rollno==other.rollno;
    }
    @Override
    public int hashCode(){
        return Objects.hash(rollno);
    }
    @Override
    public int compareTo(student o){
        return this.rollno-o.rollno;
    }

}
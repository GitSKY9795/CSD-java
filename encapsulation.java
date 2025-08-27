package java.oops;
import java.lang.reflect.Field;
 class Emp{
    private double salary;
    public double setSalary(double salary) {
        this.salary = salary;
        return this.salary;
    }
  
    private String name;
    public String setName(String n) {
       this.name = n;
        return name;
    }
 }
public class encapsulation {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("Hello");
        Emp emp = new Emp();
        Field salaryField = Emp.class.getDeclaredField("salary");
        salaryField.setAccessible(true);
        double aa = (double) salaryField.get(emp);
        System.out.println(aa);
    }
}

public class SUper5 {
    class Employee{
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

void show() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }
    class Manager extends Employee {
        String department;

        Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        void show() {
            super.show();
            System.out.println("Department: " + department);
        }
    }
    public static void main(String[] args) {
        SUper5 outer = new SUper5();
        Manager mgr = outer.new Manager("Bob", 70000, "Sales");
        mgr.show();
    }

}

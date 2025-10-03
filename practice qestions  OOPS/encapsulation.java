class Employee{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;   
     }
        public int getId(){
            return id;
        }
        public String getName(){
            return name;        }
}
public class encapsulation {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.setId(20);
        emp.setName("Sumeet");
        System.out.println("Employee name is: "+ emp.getName());
        System.out.println("Employee id is: "+emp.getId());
    }
    
}

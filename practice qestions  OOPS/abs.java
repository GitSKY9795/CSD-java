abstract class Vehicle{
    abstract void wheels(int wh);
    abstract void number(int num);
}
class car extends Vehicle{

    @Override
    void wheels(int wh) {
       if(wh==0)
        throw new UnsupportedOperationException("Unimplemented method 'wheels'");
      System.out.println("Brakes are pushed"+wh);
    }

    @Override
    void number(int num) {
       if(num==0)
        throw new UnsupportedOperationException("Unimplemented method 'number'");
     System.out.println("The vehicle number is "+num);
    }

}
 public class abs{
  public static void main(String[] args) {
      car c1= new car();
      c1.wheels(20);
      c1.number(2008);
    
      
  
  }
 }
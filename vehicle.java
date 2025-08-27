package java.oops;

abstract public class vehicle { 
    int tyres;
    void common(){
        System.out.println("This is common ");
    }
   abstract void stop();

    
    public static void main(String[] args) {
        car c = new car();
        c.tyres=4;
        c.common();
        c.stop();

    }
    
}

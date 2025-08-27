package OOps.polymorphism;
//late binding`
class a1{
    void m1(){
        System.out.println("coming from m1");
    }
}
class b1 extends a1{
    //method overidding
    void m1(){
        System.out.println("coming from m2");
    }
}
public class dpoly {
    public static void main(String[] args) {
        System.out.println("A");
        a1 n=new b1();
        n.m1();

    }
}

package OOps.polymorphism;
//static polymorphism or early binding or comiple time polymorphism
public class cpoly {
    cpoly(){

    }
    cpoly(int a){

    }
    public static void main(String[] args) {
        System.out.println("A");
        cpoly cc=new cpoly();
        cc.M1();
    }

    public static void main() {
        System.out.println("D");
    }
    void M1(int a){
        System.out.println("B");
    }
    void M1(int a, String b){
        System.out.println("C");
    }
    void M1(){
        System.out.println();
    }
}

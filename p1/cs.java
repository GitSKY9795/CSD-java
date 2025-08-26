package p1;

public class cs {
   final public static void main(String[] args) {
        System.out.println("hi");
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);

        }
    }}
    class aa{
        public static void main(String[] args) {
            System.out.println("Aa data");
            cs.main(new String[]{"Hello","aj","aoa"});
        }
    }


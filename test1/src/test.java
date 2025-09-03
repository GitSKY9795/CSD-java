import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       quickride qk= new quickride();
       qk.cab();
       qk.train();
       qk.bus();
    }}

    abstract class booking {
        abstract void cab();
        abstract void train();
        abstract void bus();
        abstract void cancel();
    }

    class quickride extends booking {
        Scanner sc = new Scanner(System.in);

        @Override
        void cab() {
            System.out.println("Your scheduled time is 10:00 AM and your ID is CAB101");
            System.out.println("Are you confirming the CAB ride or cancelling?");
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("cancel")) {
                System.out.println("Your refunded amount will be credited to your bank: 300");
            } else {
                System.out.println("Your cCAB is on the waur");
            }
        }

        @Override
        void train() {
            System.out.println("Your scheduled time is 10:00 AM and your TRAIN ID is TRN202");
            System.out.println("Are you confirming the ride or cancelling?");
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("cancel")) {
                System.out.println("Your refunded amount will be credited to your bank: 1000");
            } else {
                System.out.println("Enjoy the journey");
            }
        }

        @Override
        void bus() {
            System.out.println("The bus ride with ID BUS303 is confirmed");
            System.out.println("Next");
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("cancel"))
                System.out.println("This ride cannot be cancelled");
        }

        @Override
        void cancel() {
            System.out.println("Cancel method called");
        }
    }

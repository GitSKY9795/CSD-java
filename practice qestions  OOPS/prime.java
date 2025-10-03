public class prime {
    public static void main(String[] args) {
        int n=29;
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("The number is prime.");
        }else{
            System.out.println("The number is not prime.");
        }
    }
}

package mse1;
import java.util.Arrays;
import java.util.HashMap;

public class sum {
public static void main(String[] args) {
    int num[]={2,7,11,15};
    int target=9;
    int result[]= new int []{};
    HashMap<Integer,Integer>ump = new HashMap<>();
    for(int i=0;i<num.length;i++){
        int complement = target-num[i];
        if(ump.containsKey(complement)){
                result = new int[]{ump.get(complement),i};
                System.out.println(Arrays.toString(result));
                return;
        }
        ump.put(num[i],i);

    }
}
    
}

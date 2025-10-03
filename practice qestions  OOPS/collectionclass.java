import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionclass {
    public static void main(String[] args) {
        List<student>list=new ArrayList<>();
      /* list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list,15)); */ 
        list.add(new student("sumeet", 0));
        list.add(new student("naveen", 5));
        list.add(new student("choos", 27));
        list.add(new student("mandii", 20));
        System.out.println(list);
        Collections.sort(list,new Comparator<student>() {
            @Override
            public int compare(student o1, student o2){
                return o1.name.compareTo(o2.name);
            }
            
        });
        System.out.println(list);
    }
    
}

import java.util.HashSet;
import java.util.Set;

public class coustom {
    public static void main(String[] args) {
        Set<student>st=new HashSet<>();
        st.add(new student("Sumeet", 15));
        st.add(new student("Su", 13));
        st.add(new student("Smeet", 14));
        st.add(new student("eet", 2));
        st.add(new student("meet", 2));
        System.out.println(st);
    }
}

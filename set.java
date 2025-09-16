import java.util.*;
public class set {
    public static void main(String args[])
    {
        Set<Integer> st=new HashSet<>();
        st.add(3);
        st.add(8);
        st.add(2);
        st.add(10);
        System.out.println(st);
        Set<Integer> st1=new LinkedHashSet<>();
        st1.add(3);
        st1.add(8);
        st1.add(2);
        st1.add(10);
        System.out.println(st1);
        Set<Integer> st2=new TreeSet<>();
        st2.add(3);
        st2.add(8);
        st2.add(2);
        st2.add(10);
        System.out.println(st2);
    }

}
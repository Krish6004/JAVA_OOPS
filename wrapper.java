import java.util.*;

public class wrapper {
    public static void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Raj");
        names.add("Deepak");
        names.add("Krish");

        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.size());
        System.out.println(names.contains("Krish"));
        System.out.println(names.set(0, "Ayush"));
        System.out.println(names.get(0));



    }
}
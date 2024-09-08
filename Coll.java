import java.util.*;
public class Coll {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("yash");
        names.add("raman");
        System.out.println(names);
        ArrayList list= new ArrayList<>();
        list.add("yash");
        list.add(123);
        System.out.println(list.get(1));
    }
}

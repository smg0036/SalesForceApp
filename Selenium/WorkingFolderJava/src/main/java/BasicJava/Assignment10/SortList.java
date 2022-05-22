package BasicJava.Assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("tree");
        al.add("house");
        al.add("taxi");
        al.add("bridge");
        al.add("city");
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);
    }
}

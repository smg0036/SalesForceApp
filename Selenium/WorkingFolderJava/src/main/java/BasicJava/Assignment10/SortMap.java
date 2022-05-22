package BasicJava.Assignment10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortMap {

    static Map<Integer, String> hmp = new HashMap<>();

    static void sortByKey(){
        TreeMap<Integer,String> sorted = new TreeMap<>(hmp);

        for(Map.Entry<Integer,String> m:sorted.entrySet()){
            System.out.println("Ke y= "+m.getKey()+", "+"Value = "+m.getValue());
        }


    }
    public static void main(String[] args) {


        hmp.put(12, "Sam");
        hmp.put(15,"Roger");
        hmp.put(20,"Annie");
        hmp.put(16,"Lisa");

       sortByKey();
    }
}

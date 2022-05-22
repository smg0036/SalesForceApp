package BasicJava.Assignment10;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeySort {

    static Map<Integer, String> hm = new HashMap<>();

    public static void sortKey(){

        TreeMap<Integer,String> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(hm);

        for(Map.Entry<Integer,String> entry : sorted.entrySet()){
            System.out.println("Key="+entry.getKey()+" , Value="+entry.getValue());
        }

    }

    public static void main(String[] args) {

        hm.put(23, "Annie");
        hm.put(18, "Roger");
        hm.put(51,"Adam");
        hm.put(60,"Sandy");
        hm.put(38, "Bob");


        System.out.println(hm);


        sortKey();

    }
}

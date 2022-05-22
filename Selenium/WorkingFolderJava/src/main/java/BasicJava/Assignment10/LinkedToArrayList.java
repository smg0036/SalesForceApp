package BasicJava.Assignment10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedToArrayList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("guava");
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("bananna");
        fruits.add("pineapple");

        ArrayList<String> newFruits = new ArrayList<String>(fruits);

        System.out.println(newFruits);
    }
}

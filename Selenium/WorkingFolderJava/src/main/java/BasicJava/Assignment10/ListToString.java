package BasicJava.Assignment10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListToString {

    public static void main(String[] args) {

        List<String> fruits= new ArrayList<String>();
        fruits.add("plum");
        fruits.add("apricot");
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("pineapple");
        String s="";

        System.out.println(fruits);

        for(String str:fruits){
            s+=str+" ";
        }
        System.out.println("The converted string is:  "+s);




    }
}

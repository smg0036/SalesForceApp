
package AdvJava.JavaHackathon;
import java.util.*;
public class DuplicateChar13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = sc.next();
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch){
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter); } else { map.put(c, 1);}
        }
        System.out.println("Duplicate characters excluding white space :");
        for(char c : map.keySet()) {
            if(map.get(c) > 1 && !Character.isWhitespace(c)) { System.out.println(c); }
        }
    }
}

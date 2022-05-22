package AdvJava.JavaHackathon;
import java.util.*;
public class CharacterOccurence14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = sc.next();
       char[] ch = s.toCharArray();
       Character[] chOb = new Character[ch.length];
       for(int i=0;i<chOb.length;i++) { chOb[i] =(Character) ch[i]; }
        Set<Character> targetSet = new HashSet<Character>();
        Collections.addAll(targetSet, chOb);
        Iterator<Character> it = targetSet.iterator();
        while (it.hasNext()) {
            int count=0;
            char c=(char)it.next();
            for(int j=0;j<chOb.length;j++) {
                if(c==ch[j]){ count++; }
            }
            System.out.println(c+" appeared "+count+" times");
        }
    }
}


package AdvJava.JavaHackathon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class UniqueWords12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter a sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        Map<String,Integer> m= new HashMap<String,Integer>();

        for(String str:words){
            if(m.containsKey(str)){
                int counter=m.get(str);
                m.put(str,++counter);
            }else{ m.put(str,1);}
        }
        System.out.println("Distinct characters:");
        for(String word : m.keySet()) {
            if(m.get(word) == 1) { System.out.println(word);}
        }
    }
}

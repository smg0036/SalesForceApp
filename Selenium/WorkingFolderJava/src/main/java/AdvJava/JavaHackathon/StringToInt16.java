package AdvJava.JavaHackathon;
import java.util.Scanner;
public class StringToInt16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s =sc.next();
        int i = Integer.valueOf(s);
        System.out.println("The integer value of the String is "+i);
    }
}

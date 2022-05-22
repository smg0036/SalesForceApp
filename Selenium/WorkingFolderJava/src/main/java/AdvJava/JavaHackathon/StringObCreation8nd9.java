package AdvJava.JavaHackathon;

import java.util.Scanner;

public class StringObCreation8nd9 {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int p = Integer.parseInt(s1);
        System.out.println("String "+s1+" is converted to Int "+p);
        System.out.println("Please enter a integer value: ");
        int n= sc.nextInt();
        String ns=String.valueOf(n);
        System.out.println("Integer "+n+" is converted to String "+ns);
    }
}

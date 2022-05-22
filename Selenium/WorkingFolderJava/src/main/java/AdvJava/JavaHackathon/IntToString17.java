package AdvJava.JavaHackathon;

import java.util.Scanner;

public class IntToString17 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int i =sc.nextInt();
        String s=Integer.toString(i);//Another way: String s=String.valueOf(i);

        System.out.println("The String value of integer is "+s);
    }
}

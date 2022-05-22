
package AdvJava.JavaHackathon;
import java.util.Scanner;
public class FactNonRec1 {
    //find factorial of a number(non recursive)
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println("Result: " + result);
    }
}
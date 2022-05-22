package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class SwapWithoutVariable {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        a = sc.nextInt();
        System.out.println("a=" + a);
        System.out.println("Please enter another number: ");
        b = sc.nextInt();
        System.out.println("b=" + b);

        a = a + b;
        b=a-b;
        a = a - b;


        System.out.println("The Swapped values are a=" + a + " and b=" + b);
    }
}
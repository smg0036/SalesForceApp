package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class SwapTwo {

        public static void main(String[] args) {
            int a, b, c;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            a = sc.nextInt();
            System.out.println("a="+a);
            System.out.println("Please enter another number: ");
            b = sc.nextInt();
            System.out.println("b="+b);

            c=a;
            a=b;
            b=c;

            System.out.println("The Swapped values are a="+a+ " and b="+b);
    }
}

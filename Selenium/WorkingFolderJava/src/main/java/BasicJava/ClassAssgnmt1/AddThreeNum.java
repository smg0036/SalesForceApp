package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class AddThreeNum {

    public static void main(String[] args) {

        int a, b, c, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        a = sc.nextInt();
        System.out.println("Please enter another number: ");
        b = sc.nextInt();
        System.out.println("Please enter one more number: ");
        c = sc.nextInt();

        sum = a+b+c;
        System.out.println("Sum of the three numbers is "+sum);


    }
 }
package BasicJava.Assgnmt1;

import java.util.Scanner;

public class NumOperations4 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        a=sc.nextInt();
        System.out.println("Please enter another number: ");
        b=sc.nextInt();

        System.out.println(a+" + "+b +"=" +(a+b));
        System.out.println(a+" - "+b +"=" +(a-b));
        System.out.println(a+" * "+b +"=" +(a*b));
        System.out.println(a+" / "+b +"=" +(a/b));
        System.out.println(a+" % "+b +"=" +(a%b));


        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
        // of two numbers(read two numbers from user).
        // Test Data:Input first number: 125Input second number: 24Expected Output :125 + 24 = 149125 - 24 = 101125 x 24 = 3000125 / 24 = 5125 mod 24 = 5
    }
}


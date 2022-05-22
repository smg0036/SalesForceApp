package BasicJava.Assgnmt1;

import java.util.Scanner;

public class MathOps19 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        a = sc.nextInt();
        System.out.print("Please enter another number: ");
        b = sc.nextInt();
        int sum=a+b;
        double diff=a-b;
        double prod=a*b;
        double div=a/b;
        int mod= a%b;

        System.out.println("sum="+sum+",  difference ="+diff+", product ="+prod+", div ="+div+" ,modulus="+mod);



    }
}

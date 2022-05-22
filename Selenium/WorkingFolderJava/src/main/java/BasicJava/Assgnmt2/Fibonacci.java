package BasicJava.Assgnmt2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        long f1 = 0;
        long f2 =1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the maximum limit for the sequence: ");
        int n=sc.nextInt();

        System.out.print(f1+" "+f2+" ");
        n=n-2;

        while(n>0){
            f1 = f1+f2;
            f2= f1+f2;
            System.out.print(f1+" "+f2+" ");
            n=n-2;
        }
    }
}

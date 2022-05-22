package BasicJava.Assgnmt2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n, fact=1;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n=sc.nextInt();

        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial is "+fact );
    }

}

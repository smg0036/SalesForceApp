package BasicJava.Assgnmt1;

import java.util.Scanner;

public class AverageNum5 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        a = sc.nextInt();
        System.out.print("Please enter another number: ");
        b = sc.nextInt();
        System.out.print("Please enter one more number: ");
        c = sc.nextInt();

        System.out.println("The average of the three numbers is: "+ (a+b+c)/3);
    }
}

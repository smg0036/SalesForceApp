package BasicJava.Assgnmt1;

import java.util.Scanner;

public class MultTable3 {
    public static void main(String[] args) {

        int a;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        a = sc.nextInt();
        while (i <=10) {
            System.out.println(a * i);
            i++;
        }
    }

}




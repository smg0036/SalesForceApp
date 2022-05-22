package BasicJava.Assignment8;

import java.util.Scanner;

public class Exceptions {

    public static void validEvenNo(int num) throws OddNumException {

        if (num % 2 != 0) {
            throw new OddNumException("user entered wrong unexpected data");
        }

    }

    public static void main(String[] args) throws OddNumException {
        Scanner sc = new Scanner(System.in);
        String prompt = "yes";
        do {
            System.out.println("Enter a even number: ");
            int n = sc.nextInt();
            try {
                validEvenNo(n);
            } catch (OddNumException e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("Do you want to enter an input?Yes or No");
                prompt = sc.next();
            }

        } while (prompt.equalsIgnoreCase("yes"));
        sc.close();


    }
}

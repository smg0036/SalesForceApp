package BasicJava.Assgnmt1;

import java.util.Scanner;

public class SumAvg17 {
    public static void main(String[] args) {
         int num1=0;
         int num2=0;
         int num3=0;

         int sum=0;
         double avg=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        num1=sc.nextInt();
        System.out.println("Please enter the second number: ");
        num2=sc.nextInt();
        System.out.println("Please enter the third number: ");
        num3=sc.nextInt();

        sum= num1+num2+num3;
        avg=sum/3;

        System.out.println("The sum of three numbers is: "+sum);
        System.out.println("The average of three numbers is: "+avg);

    }
}

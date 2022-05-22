package BasicJava.Assgnmt2;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        year=sc.nextInt();

        if((year%4)==0){
            if (year % 100 != 0) {
                System.out.println("It is a Leap Year");
            }else{
                if(year%400==0){
                    System.out.println("It is a Leap Year");
                }else{
                    System.out.println("It is not a Leap year");
                }
            }
        }else{
            System.out.println("It is not a LeapYear");
        }
    }
}

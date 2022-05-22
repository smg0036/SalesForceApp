
package AdvJava.JavaHackathon;
import java.util.Scanner;

public class FactRecursive3 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter value of n");
            int n = scan.nextInt();
            int result = factorial(n);
            System.out.println("Result: " + result);

    }
    public static int factorial(int num){
               if(num<=1){
                   return 1;
                }
                while(num>1) {
                return num*factorial(num-1);
                }

          return num;
    }
}

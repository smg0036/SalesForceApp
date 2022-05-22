package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class MaxOfThreeNums {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        a = sc.nextInt();
        System.out.print("Please enter another number: ");
        b = sc.nextInt();
        System.out.print("Please enter one more number: ");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("The maximum of three nums is: " +a);
            }else{
                System.out.println("The maximum of three nums is: " +c);
            }
        }else if(b>c){
            System.out.println("The maximum of three nums is: " +b);
        }else{
            System.out.println("The maximum of three nums is: " +c);
        }
    }
}

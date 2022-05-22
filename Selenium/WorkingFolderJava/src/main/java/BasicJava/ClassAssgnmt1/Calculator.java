package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

       double a, b, result;
       char operator;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        a=sc.nextDouble();

        System.out.println("Please enter another number: ");
        b=sc.nextDouble();
        System.out.println("Please choose the operator: +, -, /,*");
        operator=sc.next().charAt(0);
        switch(operator){
            case '+':

                result=a+b;
                System.out.println("The sum of two numbers is "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("The difference of two numbers is"+result);
                break;
            case '/':
                result=a/b;
                System.out.println("The division of two numbers is"+result);
                break;
            case '*':
                result=a*b;
                System.out.println("The product of two numbers is"+result);
                break;
            default:
                break;




        }
        sc.close();


    }
}

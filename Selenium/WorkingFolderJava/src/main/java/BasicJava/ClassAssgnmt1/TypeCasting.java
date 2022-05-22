package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class TypeCasting {

        public static void main(String[] args) {

            float a,c;
            double b,d;


            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a floating point number: ");
            a = sc.nextFloat();
            System.out.println("a="+a);
            System.out.print("Please enter a number of type double: ");
            b = sc.nextDouble();
            System.out.println("b="+b);


            d=a;
            System.out.println("The value after conversion of a to double is "+d);
            c=(float)b;
            System.out.println("The value after conversion of b to float is "+c);




        }
}

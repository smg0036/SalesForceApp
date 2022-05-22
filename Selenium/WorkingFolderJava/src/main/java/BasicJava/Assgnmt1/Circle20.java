package BasicJava.Assgnmt1;

import java.util.Scanner;

public class Circle20 {
    public static void main(String[] args) {
        double radius = 0;
        double area=0;
        double circumference=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        radius = sc.nextDouble();
        area = 3.14*radius*radius;
        circumference = 2*3.14*radius;
        circumference = 2*3.14*radius;
        System.out.println("Area= "+area );
        System.out.println("Circumference = "+circumference);

    }
}

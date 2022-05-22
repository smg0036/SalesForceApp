package BasicJava.Assgnmt1;

import java.util.Scanner;

public class Rect21 {
    public static void main(String[] args) {
        double height=0;
        double width=0;


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        height = sc.nextDouble();
        System.out.print("Please enter a number: ");
        width = sc.nextDouble();

        double area=width*height;
        double perimeter=0.5*width*height;

        System.out.println("Area of rectangle is "+area);
                System.out.println("Perimeter of rectangle is "+perimeter);

    }
}

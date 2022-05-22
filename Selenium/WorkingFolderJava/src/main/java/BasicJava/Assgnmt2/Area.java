package BasicJava.Assgnmt2;
import java.util.Scanner;
public class Area {
    double  areaCir, areaTri;
    public static void main(String[] args) {
            double r,l,h,ac,at;
            Area A = new Area();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the radius of the circle");
            r=sc.nextDouble();
            ac=A.area(r);
            System.out.println("The area of the circle is: "+ac);
            System.out.println("Please enter the length of the triangle");
            l=sc.nextDouble();
            System.out.println("Please enter the height of the triangle");
            h=sc.nextDouble();
            at=A.area(l,h);
            System.out.println("The area of Triangle is: "+at);
    }
    public double area(double radius) {
        areaCir = 3.14 * (radius * radius);
        return areaCir;
    }
    public double area(double length, double height){
        areaTri=0.5*length*height;
        return areaTri;
    }
}

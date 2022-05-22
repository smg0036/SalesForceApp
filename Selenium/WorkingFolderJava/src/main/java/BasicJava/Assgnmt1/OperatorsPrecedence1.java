package BasicJava.Assgnmt1;

public class OperatorsPrecedence1 {

    public static void main(String[] args) {

        int a, b, c, d;

        a=-5+8*6;
        b=(55+9)%9;
        c=20+-3*5/8;
        d=5+15/3*2-8%3;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
    }

    // -5 + 8 * 6b. (55+9) % 9c. 20 + -3*5 / 8d. 5 + 15 / 3 * 2 - 8 % 3Expected Output :4311913
}

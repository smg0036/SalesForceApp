
package AdvJava.JavaHackathon;

//Q2. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true

import java.util.Scanner;

public class BooleanTest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any three boolean values: ");
        boolean a = sc.nextBoolean();
        boolean b =sc.nextBoolean();
        boolean c =sc.nextBoolean();

        if(((a==true)&&(b==true))||((a==true)&&(c==true))||((c==true)&&(b==true))){

            System.out.println("There are atleast two true values");
        }else{
            System.out.println("There are no two true values");
        }
    }
}

package BasicJava.Assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListReversal {

    public static void main(String[] args) {
        int n=0;
        ArrayList al = new ArrayList();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter five integers: ");
        while(n<5){
            al.add(sc.nextInt());
            n++;
        }
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);


    }
}

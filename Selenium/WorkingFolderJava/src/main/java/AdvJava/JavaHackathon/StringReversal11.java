
package AdvJava.JavaHackathon;
import java.util.Scanner;
public class StringReversal11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s= sc.nextLine();
        int size = s.length();
        char ch;
        String p = "";
        for(int i=(size-1);i>=0;i--){
               ch=s.charAt(i);
               p=p+ch;
        }
        System.out.println("The value of reversed string is: "+p);
    }
}

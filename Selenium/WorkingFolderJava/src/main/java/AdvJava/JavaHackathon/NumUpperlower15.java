
package AdvJava.JavaHackathon;
import java.util.Scanner;
public class NumUpperlower15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the input: ");
        String s=sc.nextLine();
        int upperCaseCount=0, lowerCaseCount=0, integerCount=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){ upperCaseCount++; }
            else if(Character.isLowerCase(s.charAt(i))){lowerCaseCount++;}
            else if(Character.isDigit(s.charAt(i))){ integerCount++; }
        }
        System.out.println("upperCaseCount: "+ upperCaseCount);
        System.out.println("lowerCaseCount: "+ lowerCaseCount);
        System.out.println("integerCount: "+integerCount);
    }
}


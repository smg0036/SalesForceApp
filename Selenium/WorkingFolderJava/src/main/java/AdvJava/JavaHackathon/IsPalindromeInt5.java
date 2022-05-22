package AdvJava.JavaHackathon;
import java.util.Scanner;
public class IsPalindromeInt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        String n = sc.next();
        boolean result = isPalindrome(n);
        if(result==true){ System.out.println("The number "+n+" is palindrome"); }
        else{ System.out.println("The number "+n+" is not a palindrome"); }
    }
    public static boolean isPalindrome(String num){
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        char[] ch = num.toCharArray();
        int count=0;
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]==sb.charAt(i)){
                count++;
            }
        }
        if(count==(num.length()/2)){
            return true;
        }else{
          return false;
        }
    }
}

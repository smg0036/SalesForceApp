package AdvJava.JavaHackathon;

import java.util.Scanner;
public class IsPalindromeIntAndString10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a integer or string: ");
        String s = sc.next();
        boolean result = isPalindrome(s);
        if(result==true){ System.out.println("The input "+s+" is palindrome");}else{
            System.out.println("The input "+s+" is not a palindrome"); }
    }
    public static boolean isPalindrome(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        char[] ch = input.toCharArray();
        int count=0;
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]==sb.charAt(i)){ count++;}
        }
        if(count==(input.length()/2)){ return true; }else{ return false; }
    }
}

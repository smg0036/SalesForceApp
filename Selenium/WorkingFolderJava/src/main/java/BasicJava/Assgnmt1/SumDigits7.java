package BasicJava.Assgnmt1;

import java.util.Scanner;

public class SumDigits7 {

    public static void main(String[] args) {

        int num = 0;
        int sum=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        num=sc.nextInt();
        String s = Integer.toString(num);
        char[] ch=new char[s.length()];
        int[] n = new int[s.length()];
        for(int i=0; i<s.length();i++){
            ch[i]=s.charAt(i);
            n[i]=Character.getNumericValue(ch[i]);
            sum=sum+n[i];
        }
        System.out.println("The sum of digits of the number entered is: "+sum);

    }
}

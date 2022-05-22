package BasicJava.Assgnmt1;

import java.util.Scanner;

public class DecToBinary6 {
    public static void main(String[] args) {

        int num;
        String result =" ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        num=sc.nextInt();

        while((num/2)!=0){
            result += String.valueOf(num%2);
            num=num/2;
        }
        result += String.valueOf(num%2);

        char[] res = result.toCharArray();
        for(int i=(res.length-1);i>=0;i--){
            System.out.print(res[i]);
        }

    }
}

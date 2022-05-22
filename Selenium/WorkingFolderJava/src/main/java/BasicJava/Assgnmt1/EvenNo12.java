package BasicJava.Assgnmt1;

import java.util.Scanner;

public class EvenNo12 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the maximum limit: ");
        num=sc.nextInt();
        for (int j = 1;j<=num;j++){
            if((j%2)==0){
                System.out.print(j+" ");
            }
        }
    }
}

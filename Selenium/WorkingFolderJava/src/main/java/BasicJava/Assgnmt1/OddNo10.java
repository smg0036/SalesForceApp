package BasicJava.Assgnmt1;

import java.util.Scanner;

public class OddNo10 {

    public static void main(String[] args) {
        int num=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the maximum limit: ");
        num=sc.nextInt();
        for (int j = 1;j<=num;j++){
            if((j%2)==1){
                System.out.print(j+" ");
            }
        }
    }
}

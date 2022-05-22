package AdvJava.JavaHackathon;

import java.util.Scanner;

public class AllConsecutiveNums18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();


        for(int start=1;start<(n+1)/2;start++) {
            int sum=start;
           int  next= start + 1;
           while(next<=(n+1)/2) {
               sum+=next;
              if(sum==n){
                  for(int i=start;i<=next;i++){
                      System.out.print(i+" ");
                  }
              }
               next++;
           }
           System.out.println();
        }

    }
}

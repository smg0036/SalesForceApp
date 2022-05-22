package AdvJava.JavaHackathon;
//Q4. Given an array of integers, sort the integer values.
import java.util.Arrays;
import java.util.Scanner;

public class SortArray4 {

    public static void main(String[] args) {

        int[] arrayOfInt = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ten integer values: ");
        for(int i=0;i<10;i++){
            arrayOfInt[i]=sc.nextInt();
        }
        Arrays.sort(arrayOfInt);
        System.out.println("The Sorted array elements: ");
        for(int j:arrayOfInt){
            System.out.println(j);
        }

    }

}

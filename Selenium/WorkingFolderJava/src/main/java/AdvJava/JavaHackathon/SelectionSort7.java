package AdvJava.JavaHackathon;
import java.util.Scanner;
public class SelectionSort7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the series");
        int n = sc.nextInt();
        if (n == 0) { throw new Exception();}
        int[] array = new int[n];
        System.out.println("Please enter the elements ");
        for (int i = 0; i < n; i++) { array[i] = sc.nextInt(); }
        int temp=0;
        for(int j=0;j<n-1;j++) {
            for (int i = j + 1; i < n; i++) {
                if (array[j] > array[i]) {
                    temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println("The elements after sorting are as follows: ");
        for(int p:array) { System.out.println(p);}
    }
}

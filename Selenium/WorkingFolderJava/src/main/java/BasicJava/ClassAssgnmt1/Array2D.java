package BasicJava.ClassAssgnmt1;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int row, col;



        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the row size: ");
        row=sc.nextInt();
        System.out.println("Please enter the col size: ");
        col=sc.nextInt();

        int[][] array = new int[row][col];

        for(int i =0; i<row ; i++){
            for(int j=0;j<col;j++){
                array[i][j]=1;
            }
        }

        for(int i =0; i<row ; i++){
            for(int j=0;j<col;j++){
                System.out.print(array[i][j]+" ");
            }

            System.out.println();
        }

        //System.out.println(array[row][col]);




    }
}

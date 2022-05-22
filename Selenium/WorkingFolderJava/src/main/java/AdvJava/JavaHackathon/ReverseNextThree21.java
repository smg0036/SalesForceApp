package AdvJava.JavaHackathon;

public class ReverseNextThree21 {
    public static void main(String[] args) {
        int[] array = {3,2,4,7,0,3,1,5,8,4};
        int k = 3;
        int temp=0;
        for(int i =0; i<(array.length-2);i=i+3){
            temp=array[i];
            array[i]=array[i+2];
            array[i+2]=temp;
        }
        for(int i:array) {
            System.out.print(i + " ");
        }
    }
}
